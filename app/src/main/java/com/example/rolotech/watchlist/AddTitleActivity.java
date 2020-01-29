package com.example.rolotech.watchlist;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.rolotech.watchlist.data.TitleStorage;
import com.example.rolotech.watchlist.models.Title;
import com.example.rolotech.watchlist.persistence.AppDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * A login screen that offers login via email/password.
 */
public class AddTitleActivity extends AppCompatActivity {

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = AppDatabase.getAppDatabase(this);
        setContentView(R.layout.activity_add_title);
        final EditText titleName = findViewById(R.id.title_name);
        final EditText titleYear = findViewById(R.id.title_year);
        final Spinner titleType = findViewById(R.id.type_spinner);
        final Button button = findViewById(R.id.add_title_button);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                db.titleDao().insertAll(new Title(titleName.getText().toString(), titleYear.getText().toString(), titleType.getSelectedItem().toString()));
                //TitleStorage.titlesStored.add(new Title(titleName.getText().toString(), titleYear.getText().toString(), titleType.getSelectedItem().toString()));
                finish();

            }
        });

        List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Select type");
        spinnerArray.add("Series");
        spinnerArray.add("Movie");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        titleType.setAdapter(adapter);
    }


}


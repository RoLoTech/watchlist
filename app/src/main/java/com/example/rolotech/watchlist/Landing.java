package com.example.rolotech.watchlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.rolotech.watchlist.data.TitleStorage;
import com.example.rolotech.watchlist.models.Title;

import java.util.ArrayList;
import java.util.List;

public class Landing extends AppCompatActivity {

    private ListView lv;
    private List<String> your_array_list = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        final Button button = findViewById(R.id.add_title);
        lv = findViewById(R.id.listView);

        TitleStorage.initTitles();

        arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                your_array_list);

        lv.setAdapter(arrayAdapter);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Context context = getApplicationContext();
//                CharSequence text = "Anda a la cancha";
//                int duration = Toast.LENGTH_SHORT;
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();
                launchActivity();
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
//        your_array_list.clear();
//        for (Title title : TitleStorage.titlesStored) {
//            your_array_list.add(title.getName());
//        }
//        arrayAdapter.notifyDataSetChanged();
        arrayAdapter.clear();
        for (Title title : TitleStorage.titlesStored) {
              arrayAdapter.add(title.getName());
          }

        Log.e("arrayCount", your_array_list.size() + "");
        Log.e("titlesCount", TitleStorage.titlesStored.size() + "");
    }

    private void launchActivity() {
        Intent intent = new Intent(this, AddTitleActivity.class);
        startActivity(intent);
    }
}

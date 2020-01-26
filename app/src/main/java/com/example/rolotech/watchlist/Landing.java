package com.example.rolotech.watchlist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Landing extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        final Button button = findViewById(R.id.add_title);
        lv = (ListView) findViewById(R.id.listView);

        List<String> your_array_list = new ArrayList<String>();
        your_array_list.add("Titans");
        your_array_list.add("Sex Education");
        your_array_list.add("Peaky Blinders");
        your_array_list.add("You");
        your_array_list.add("The Blacklist");
        your_array_list.add("Blindspot");
        your_array_list.add("Merlí");
        your_array_list.add("Black Mirror");
        your_array_list.add("Sherlock");
        your_array_list.add("Arrow");
        your_array_list.add("Breaking Bad");
        your_array_list.add("The Flash");
        your_array_list.add("La casa de papel");
        your_array_list.add("Sense8");
        your_array_list.add("How to sell drugs online (fast)");
        your_array_list.add("Salvation");
        your_array_list.add("The End of the F***ing World");
        your_array_list.add("Stranger Things");
        your_array_list.add("The Innocents");
        your_array_list.add("Altamar");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                your_array_list );

        lv.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "Anda a la cancha";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}

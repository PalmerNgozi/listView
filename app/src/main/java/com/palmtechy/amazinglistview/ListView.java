package com.palmtechy.amazinglistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class ListView extends AppCompatActivity {
    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);

        String[]value = new String[] {
                "JAVA", "Python","JAVASCRIPT", "Ruby","Kotlin"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, value);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position ==0) {
                    Intent intent = new Intent(view.getContext(), Java.class);
                    startActivity(intent);
                }

                if (position==1) {
                    Intent intent = new Intent(view.getContext(), Python.class);
                    startActivity(intent);
                }

                if (position==2) {
                    Intent intent = new Intent(view.getContext(), JAVASCRIPT.class);
                    startActivity(intent);
                }

                if (position==3) {
                    Intent intent = new Intent(view.getContext(), Ruby.class);
                    startActivity(intent);
                }

                if (position==4) {
                    Intent intent = new Intent(view.getContext(), Kotlin.class);
                    startActivity(intent);
                }
            }



        });
    }
}
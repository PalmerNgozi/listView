package com.palmtechy.amazinglistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtusrname, txtpswrd ;
    EditText edtusrname, edtpswrd ;
    Button btnClicks ;

   // ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtusrname = (TextView) findViewById(R.id.txtusrname);
        txtusrname = (TextView) findViewById(R.id.txtpswd);
        edtusrname = (EditText) findViewById(R.id.edtusrnmae);
        edtpswrd = (EditText) findViewById(R.id.edtpswd) ;

        btnClicks = (Button) findViewById(R.id.btnClick) ;
        btnClicks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                //Intent intent = new Intent(getApplicationContext(),LoginActivity.class);


                String usr = txtusrname.getText().toString();
                String pswd = txtpswrd.getText().toString();


                if (usr.equals("Adewale") && pswd.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login Succesfylly", Toast.LENGTH_LONG);
                    Intent intent = new Intent(getApplicationContext(), ListView.class);
                    startActivity(intent);

                }

            }
        });

        /*listView = findViewById(R.id.listview);

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



        });*/
    }
}
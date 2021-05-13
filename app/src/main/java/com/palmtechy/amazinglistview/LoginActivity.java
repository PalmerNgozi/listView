package com.palmtechy.amazinglistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView txtusrname, txtpswrd ;
    EditText edtusrname, edtpswrd ;
    Button btnClicks ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusrname = (TextView) findViewById(R.id.txtusrname);
        txtusrname = (TextView) findViewById(R.id.txtpswd);
        edtusrname = (EditText) findViewById(R.id.edtusrnmae);
        edtpswrd = (EditText) findViewById(R.id.edtpswd) ;

        btnClicks = (Button) findViewById(R.id.btnClick) ;

        btnClicks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String usr = txtusrname.getText().toString();
                String pswd = txtpswrd.getText().toString();


                if (usr.equals("Adewale") && pswd.equals("1234")) {
                    Toast.makeText(LoginActivity.this,"Here is the detail", Toast.LENGTH_LONG);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });





    }
}
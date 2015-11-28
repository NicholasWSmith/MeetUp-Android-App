package com.example.nickwsmith.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button firstButton = (Button) findViewById(R.id.logInButton);
        final EditText input = (EditText) findViewById(R.id.netIDInput);


        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String id = String.valueOf(input.getText());
            String welcomeMessage = "Welcome to Meet Up" + id;


            }
        });
    }



}

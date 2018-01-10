package com.example.android.myapplicationone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.util.Log;
import android.widget.EditText;



public class Main2Activity extends AppCompatActivity {

    private EditText displayTextEditField;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        displayTextEditField = (EditText) findViewById(R.id.editTextInSecondActivity);


        String extras = getIntent().getStringExtra("key");
        if (extras != null) {
           // Log.v("My outputstring is ", displayTextEditField.getText().toString() + extras);
            displayTextEditField.setText("Welcome  "+extras);


        }
    }
}

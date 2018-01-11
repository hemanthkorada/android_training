package com.example.android.myapplicationone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

     private Button button;
     private EditText usernameEditText;
     private EditText passwordEditText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.loginButtonIdentifier);
        usernameEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);


        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

				 Intent mainActivityIndent = new Intent(MainActivity.this,
                        Main2Activity.class);
                mainActivityIndent.putExtra("key",usernameEditText.getText().toString());

                startActivity(mainActivityIndent); // startActivity allow you to move
            }
        });
    }
}

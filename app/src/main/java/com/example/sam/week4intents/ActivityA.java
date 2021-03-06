package com.example.sam.week4intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        // Retrieving values
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String qString = extras.getString("qString"); // get value passed
        TextView textView = (TextView) findViewById(R.id.textView1); // set up variable for screen field
        textView.setText(qString); //populate screen variable

    }
    public void onClick (View view) {
        Intent i = new Intent(this, ActivityB.class);
        //Passing Values
        EditText editText = (EditText) findViewById(R.id.editText1); //create variable for screen input
        String myString = editText.getText().toString(); //move value to myString
        i.putExtra("qString", myString); // Pass value to ActivityB

        startActivity(i);
    }
}

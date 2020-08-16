package com.example.baithigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Result extends AppCompatActivity {

    TextView textName;
    TextView textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = this.getIntent();

        textName = (TextView) findViewById(R.id.textName);
        String name = intent.getStringExtra("name");
        textName.setText(name);
        textAge = (TextView) findViewById((R.id.textAge));
        String age = intent.getStringExtra("age");
        textAge.setText(age);

    }
}
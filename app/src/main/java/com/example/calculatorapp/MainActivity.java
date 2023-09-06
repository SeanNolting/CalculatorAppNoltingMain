package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText num1 = findViewById(R.id.num1et);
    EditText num2 = findViewById(R.id.num2et);
    TextView result = findViewById(R.id.answer_box);
    public void add()
    {
       result = num1;
    }

}
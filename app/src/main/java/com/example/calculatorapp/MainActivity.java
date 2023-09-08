package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private EditText int1;
    private EditText int2 ;
    private Button add, sub, div, mult;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int1 = findViewById(R.id.num1et);
        int2 = findViewById(R.id.num2et);
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtraction);
        div = findViewById(R.id.division);
        mult = findViewById(R.id.multiplication);
        answer = findViewById(R.id.answer_box);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(int1.getText().toString());
                int num2 = Integer.parseInt(int2.getText().toString());
                int sum = num1 + num2;
                Toast.makeText(getApplicationContext(), "Sum = " + sum, Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(int1.getText().toString());
                int num2 = Integer.parseInt(int2.getText().toString());
                int diff = num1 - num2;
                Toast.makeText(getApplicationContext(), "Difference = " + diff, Toast.LENGTH_SHORT).show();
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(int1.getText().toString());
                int num2 = Integer.parseInt(int2.getText().toString());
                int prod = num1 * num2;
                Toast.makeText(getApplicationContext(), "Product = " + prod, Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Integer.parseInt(int1.getText().toString());
                double num2 = Integer.parseInt(int2.getText().toString());
                double quot = num1 / num2;
                Toast.makeText(getApplicationContext(), "Quotient = " + quot, Toast.LENGTH_SHORT).show();
            }
        });
    }

}



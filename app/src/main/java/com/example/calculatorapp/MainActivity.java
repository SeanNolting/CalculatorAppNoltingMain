package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
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
                String sumString = String.valueOf(sum);
                answer.setText(sumString);
                //Toast.makeText(getApplicationContext(), "Sum = " + sum, Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(int1.getText().toString());
                int num2 = Integer.parseInt(int2.getText().toString());

                /*
                ADD something that checks if the text boxes (checks one or both) are empty and prompt the user to enter a number
                Utilize the isEmpty method to check the text box
                 */
                //Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                int diff = num1 - num2;
                String diffString = String.valueOf(diff);
                answer.setText(diffString);

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(int1.getText().toString());
                int num2 = Integer.parseInt(int2.getText().toString());
                int prod = num1 * num2;
                String prodString = String.valueOf(prod);
                answer.setText(prodString);
                //Toast.makeText(getApplicationContext(), "Product = " + prod, Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Integer.parseInt(int1.getText().toString());
                double num2 = Integer.parseInt(int2.getText().toString());
                double quot = num1 / num2;
                String quotString = String.valueOf(quot);
                answer.setText(quotString);
                //Toast.makeText(getApplicationContext(), "Quotient = " + quot, Toast.LENGTH_SHORT).show();
            }
        });
    }

}



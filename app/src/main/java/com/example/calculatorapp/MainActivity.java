package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.InflateException;
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
    private Button clear, change;
    private TextView answer;
    String blankBox = "Answer";

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
        clear = findViewById(R.id.clear);
        change = findViewById(R.id.change_screen);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(int1.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                    answer.setText(blankBox);
                }
                else if (TextUtils.isEmpty(int2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                    answer.setText(blankBox);
                }
                else
                {
                        int num1 = Integer.parseInt(int1.getText().toString());
                        int num2 = Integer.parseInt(int2.getText().toString());
                        int sum = num1 + num2;
                        String sumString = String.valueOf(sum);
                        answer.setText(sumString);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(TextUtils.isEmpty(int1.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(int2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else
                {
                    int num1 = Integer.parseInt(int1.getText().toString());
                    int num2 = Integer.parseInt(int2.getText().toString());
                    int diff = num1 - num2;
                    String diffString = String.valueOf(diff);
                    answer.setText(diffString);
                }

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(int1.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(int2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else {
                    int num1 = Integer.parseInt(int1.getText().toString());
                    int num2 = Integer.parseInt(int2.getText().toString());
                    int prod = num1 * num2;
                    String prodString = String.valueOf(prod);
                    answer.setText(prodString);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(TextUtils.isEmpty(int1.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(int2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Enter a number in the box" , Toast.LENGTH_LONG).show();
                }
                else
                {
                    double num1 = Integer.parseInt(int1.getText().toString());
                    double num2 = Integer.parseInt(int2.getText().toString());
                    double quot = num1 / num2;
                    String quotString = String.valueOf(quot);
                    answer.setText(quotString);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int1.setText("");
                int2.setText("");
                answer.setText("Answer");
            }
        });



    }
        public void switchScreens(View v)
        {
            Intent intent = new Intent(this, NumberPad.class);
            startActivity(intent);
        }
}



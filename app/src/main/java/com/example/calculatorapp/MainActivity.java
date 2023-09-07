package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    EditText int1 = findViewById(R.id.num1et);
    EditText int2 = findViewById(R.id.num2et);
    Button add = findViewById(R.id.addition);
    TextView answer = findViewById(R.id.answer_box);

    add.setOnClickListener(new View.OnClickListener)(
    {
        public void findSum(View view)
        {
            int num1 = Integer.parseInt(int1.getText().toString());
            int num2 = Integer.parseInt(int2.getText().toString());
            int sum = num1 + num2;
            answer.setText(sum);
        }
    })

    }

}
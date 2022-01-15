package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Start_bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_bmi);
        RadioButton rb1 =  findViewById(R.id.rg1);
        RadioButton rb2 = findViewById(R.id.rg2);
        Spinner  sp = findViewById(R.id.sp1);
        Button bt1=findViewById(R.id.btn1);
        Button bt2 = findViewById(R.id.btn2);
        Button bt3 = findViewById(R.id.btn4);
        Button bt4 = findViewById(R.id.btn4);
    }
}
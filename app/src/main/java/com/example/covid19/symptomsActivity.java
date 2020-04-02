package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class symptomsActivity extends AppCompatActivity {
    TextView tvHead3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        tvHead3=findViewById(R.id.tvHead3);
    }
}

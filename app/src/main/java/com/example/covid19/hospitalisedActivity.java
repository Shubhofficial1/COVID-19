package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hospitalisedActivity extends AppCompatActivity {
    TextView tvHospitalised;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitalised);
        tvHospitalised=findViewById(R.id.tvhospitalised);
    }
}

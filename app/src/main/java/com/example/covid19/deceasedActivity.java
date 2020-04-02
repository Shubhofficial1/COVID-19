package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class deceasedActivity extends AppCompatActivity {
    TextView tvDeceased;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deceased);
        tvDeceased=findViewById(R.id.tvDeceased);
    }
}

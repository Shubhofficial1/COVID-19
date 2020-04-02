package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class confirmedActivity extends AppCompatActivity {
    TextView tvConfirmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmed);
        tvConfirmed=findViewById(R.id.tvConfirmed);
    }
}

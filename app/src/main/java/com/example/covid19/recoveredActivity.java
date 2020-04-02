package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class recoveredActivity extends AppCompatActivity {
    TextView tvRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovered);
        tvRecovered=findViewById(R.id.tvRecovered);
    }
}

package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class testCentreInIndiaActivity extends AppCompatActivity {
    TextView tvHead2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_centre_in_india);
        tvHead2=findViewById(R.id.tvHead2);
    }
}

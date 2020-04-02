package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class stateConfirmedCaseActivity extends AppCompatActivity {
        TextView tvHead1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_confirmed_case);
        tvHead1=findViewById(R.id.tvHead1);
    }
}

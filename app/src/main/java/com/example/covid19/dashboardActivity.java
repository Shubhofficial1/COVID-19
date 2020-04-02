package com.example.covid19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class dashboardActivity extends AppCompatActivity implements ValueEventListener {
    TextView tvHead0;
    androidx.gridlayout.widget.GridLayout dashboardGrid;
    TextView tvConfirmed, tvHospitalised, tvRecovered, tvDeceased, tvCountConfirmed, tvCountHospitalised, tvCountRecovered, tvCountDeceased;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mRootReference = firebaseDatabase.getReference();
    private DatabaseReference mCountConfirmed = mRootReference.child("countConfirmed");
    private DatabaseReference mCountHospitalised = mRootReference.child("countHospitalised");
    private DatabaseReference mCountRecovered = mRootReference.child("countRecovered");
    private DatabaseReference mCountDeceased = mRootReference.child("countDeceased");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tvHead0 = findViewById(R.id.tvHead0);
        dashboardGrid = findViewById(R.id.dashboardGrid);
        tvConfirmed = findViewById(R.id.tvConfirmed);
        tvHospitalised = findViewById(R.id.tvhospitalised);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvDeceased = findViewById(R.id.tvDeceased);
        tvCountConfirmed = findViewById(R.id.tvCountConfirmed);
        tvCountHospitalised = findViewById(R.id.tvCountHospitalised);
        tvCountRecovered = findViewById(R.id.tvCountRecovered);
        tvCountDeceased = findViewById(R.id.tvCountDeceased);
        setSingleEvent(dashboardGrid);
    }

    private void setSingleEvent(final androidx.gridlayout.widget.GridLayout dashboardGrid) {
        for (int i = 0; i < dashboardGrid.getChildCount(); i++) {
            CardView cardView = (CardView) dashboardGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0) {
//                        for confirmed cases
                        Intent intent = new Intent(dashboardActivity.this, confirmedActivity.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
//                        for  hospitalised cases
                        Intent intent = new Intent(dashboardActivity.this, hospitalisedActivity.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
//                        for recovered cases
                        Intent intent = new Intent(dashboardActivity.this, recoveredActivity.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
//                        for deceased cases
                        Intent intent = new Intent(dashboardActivity.this, deceasedActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        if (dataSnapshot.getValue(String.class) != null) {
            String key = dataSnapshot.getKey();
            if (key.equals("countConfirmed")) {
                String heading1 = dataSnapshot.getValue(String.class);
                tvCountConfirmed.setText(heading1);
            } else if (key.equals("countHospitalised")) {
                String heading2 = dataSnapshot.getValue(String.class);
                tvCountHospitalised.setText(heading2);
            } else if (key.equals("countRecovered")) {
                String heading3 = dataSnapshot.getValue(String.class);
                tvCountRecovered.setText(heading3);
            } else if (key.equals("countDeceased")) {
                String heading4 = dataSnapshot.getValue(String.class);
                tvCountDeceased.setText(heading4);
            }
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        mCountConfirmed.addValueEventListener(this);
        mCountHospitalised.addValueEventListener(this);
        mCountRecovered.addValueEventListener(this);
        mCountDeceased.addValueEventListener(this);

    }

}

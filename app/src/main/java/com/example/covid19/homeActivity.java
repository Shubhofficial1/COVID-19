package com.example.covid19;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class homeActivity extends AppCompatActivity {
    TextView tvHead;
    androidx.gridlayout.widget.GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvHead=findViewById(R.id.tvHead);
        mainGrid = findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Quit COVID-19")
                .setMessage("Are you sure you want to Quit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

    private void setSingleEvent(androidx.gridlayout.widget.GridLayout mainGrid){
        for (int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView=(CardView)mainGrid.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(homeActivity.this, "You clicked at index"+finalI, Toast.LENGTH_SHORT).show();
                    if (finalI==0){
                        Intent intent=new Intent(homeActivity.this,dashboardActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==1){
                        Intent intent=new Intent(homeActivity.this,stateConfirmedCaseActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==2){
                        Intent intent=new Intent(homeActivity.this,testCentreInIndiaActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==3){
                        Intent intent=new Intent(homeActivity.this,symptomsActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==4){
                        Intent intent=new Intent(homeActivity.this,preventionActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==5){
                        Intent intent=new Intent(homeActivity.this,aboutActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(homeActivity.this, "No button pressed ", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}

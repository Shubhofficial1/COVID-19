package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class confirmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmed);


        Pie pie = AnyChart.pie();
        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Maharastra", 335));
        data.add(new ValueDataEntry("Tamil Nadu", 309));
        data.add(new ValueDataEntry("Kerela", 286));
        data.add(new ValueDataEntry("Delhi", 219));
        data.add(new ValueDataEntry("Uttar Pradesh", 172));
        data.add(new ValueDataEntry("Rajasthan", 167));
        data.add(new ValueDataEntry("Telangana", 158));
        data.add(new ValueDataEntry("Andhra Pradesh", 132));
        data.add(new ValueDataEntry("Karnataka", 124));
        data.add(new ValueDataEntry("Madhya Pradesh", 104));

        pie.data(data);
        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setChart(pie);
    }
}

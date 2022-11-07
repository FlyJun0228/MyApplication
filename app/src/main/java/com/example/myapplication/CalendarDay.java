package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class CalendarDay extends AppCompatActivity {

    private int year,month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_day);
        year = getIntent().getIntExtra("year",2022);
        month = getIntent().getIntExtra("month",0);
        day = getIntent().getIntExtra("day",0);
        Toast.makeText(this, year+" "+month+" "+day, Toast.LENGTH_SHORT).show();
    }
}
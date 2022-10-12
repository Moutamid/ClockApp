package com.moutamid.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView hourTV, minTV, secTV, dateTV;
    AnalogClock clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clock = findViewById(R.id.analogClock);
//        hourTV = findViewById(R.id.hourTV);
//        minTV = findViewById(R.id.minTV);
//        secTV = findViewById(R.id.secTV);
        dateTV = findViewById(R.id.date);

//        "EEE, MMM d, ''yy"
        DateFormat dateFormat = new SimpleDateFormat("EEE, dd/MMM/yyyy");
        Date date = new Date();
        dateTV.setText(dateFormat.format(date));
    }
}
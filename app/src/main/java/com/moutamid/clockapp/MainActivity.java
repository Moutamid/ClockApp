package com.moutamid.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView dateTV;
    Button donate, privacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTV = findViewById(R.id.date);
        donate = findViewById(R.id.donate);
        privacy = findViewById(R.id.privacy);

        donate.setOnClickListener(v -> {
            startActivity(new Intent(this, DonateActivity.class));
        });

        privacy.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/e/2PACX-1vQC-Nxdp9uSS3ih36UlWih9yYGh3AuXJGaYLZn-acpp_Uzsl53zLXnPDuJcwWmXkjKhvrljAHq1LwWD/pub"));
            startActivity(browserIntent);
        });

//        "EEE, MMM d, ''yy"
        DateFormat dateFormat = new SimpleDateFormat("EEE, dd/MMM/yyyy");
        Date date = new Date();
        dateTV.setText(dateFormat.format(date));
    }
}
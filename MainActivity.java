package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import hotchemi.android.rate.AppRate;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Travel.class);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Explore.class);
                startActivity(intent);
            }
        });


        AppRate.with(this)

                // default 10
                .setInstallDays(1)

                // default 10
                .setLaunchTimes(3)

                // default 1
                .setRemindInterval(1)
                .monitor();

        // Show a dialogue
        // if meets conditions
        AppRate.showRateDialogIfMeetsConditions(this);


    }
}
package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Flash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        try{
            this.getSupportActionBar().hide();
        }
        catch(NullPointerException e){

        }
        setContentView(R.layout.activity_flash);

        int secondsDelayed=1;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Flash.this,MainActivity.class));
                finish();
            }
        },secondsDelayed*3000);
    }
}
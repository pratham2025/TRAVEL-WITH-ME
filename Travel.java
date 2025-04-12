package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Travel extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);
        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);
        c6=(CardView) findViewById(R.id.c6);
        c7=(CardView) findViewById(R.id.c7);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Rajasthan.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Kerala.class);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Maharashtra.class);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Goa.class);
                startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Jammu.class);
                startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Himachal.class);
                startActivity(intent);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Karnataka.class);
                startActivity(intent);
            }
        });
    }

}

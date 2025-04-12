package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Kerala extends AppCompatActivity {
    Button b1,b2;
    ListView listView,listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);
        listView=(ListView) findViewById(R.id.list1);
        listView1=(ListView) findViewById(R.id.list2);
        b1=(Button) findViewById(R.id.button2);
        b2=(Button) findViewById(R.id.button3);
        final String[] Places = {"Munnar","Kochi","Thrissur","Kottayam", "Kannur"};

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  R.layout.activity_rajasthan, Places);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, Places);
        listView.setAdapter(adapter);
        final String[] Food = {"Pattu and Kadala Curri","Appam with Stew","Palada Payasam","Kearala Prawn Curri","Coconut Toddy"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, Food);
        listView1.setAdapter(adapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),Places[position],Toast.LENGTH_LONG).show();
            }
        });

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),Food[position],Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), KeExplore.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), KeHotels.class);
                startActivity(intent);
            }
        });

    }
}
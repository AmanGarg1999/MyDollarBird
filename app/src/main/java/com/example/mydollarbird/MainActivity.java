package com.example.mydollarbird;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button earning;
    Button expence;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         calendarView = (CalendarView) findViewById(R.id.cal);
         expence = (Button) findViewById(R.id.expbtn);
         earning = (Button) findViewById(R.id.earbtn);
         view = (Button) findViewById(R.id.viewbtn);


         expence.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent add_exp = new Intent(MainActivity.this, addExpences.class);
                 startActivity(add_exp);
             }
         });
        earning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add_earn = new Intent(MainActivity.this, addEarnings.class);
                startActivity(add_earn);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_det = new Intent(MainActivity.this, viewDetails.class);
                startActivity(view_det);
            }
        });


    }

}

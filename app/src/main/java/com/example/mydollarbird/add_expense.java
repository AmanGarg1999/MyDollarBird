package com.example.mydollarbird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add_expense extends AppCompatActivity {

    EditText place;
    EditText amount;
    EditText description;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        place = (EditText) findViewById(R.id.place_edit);
        amount = (EditText) findViewById(R.id.amt_edit);
        description = (EditText) findViewById(R.id.desc);

        submit = (Button) findViewById(R.id.smtbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}

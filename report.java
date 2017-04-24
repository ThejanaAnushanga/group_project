package com.example.saneth.goodn8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class report extends AppCompatActivity {
TextView time;
    TextView heart;
    TextView temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        time = (TextView)findViewById(R.id.txtTime);
        heart = (TextView) findViewById(R.id.txtHeart);
        temp = (TextView) findViewById(R.id.txtTemp);
    }
}

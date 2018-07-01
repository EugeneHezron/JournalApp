package com.example.android.journalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Toast.makeText(TitleActivity.this, "You are in title activity", Toast.LENGTH_LONG);
    }
}

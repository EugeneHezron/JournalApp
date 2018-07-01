package com.example.android.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity {

    Button toSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        toSignIn = (Button) findViewById(R.id.btn_google_sign_in);

        toSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMain = new Intent(LandingActivity.this, MainActivity.class);
                startActivity(toMain);
            }
        });
    }
}

package com.example.android.journalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    Button saveButton;
    TextView bodyEntry;
    TextView titleEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        saveButton = (Button) findViewById(R.id.btn_save);
        titleEntry = (EditText) findViewById(R.id.et_title_entry);
        bodyEntry = (TextView) findViewById(R.id.et_body_entry);

        Bundle intentBundle = getIntent().getExtras();
        if (intentBundle != null || !intentBundle.isEmpty()){
            String title = intentBundle.getString("TITLE_KEY");
            String body = intentBundle.getString("BODY_KEY");
            int id = intentBundle.getInt("ID_KEY");

            if(title.isEmpty() || title == null){
                title = "Enter title";
            }
            if(body.isEmpty() || body == null){
                body = "What's on your mind";
            }
            titleEntry.setText(title);
            bodyEntry.setText(body);
        }

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title = titleEntry.getText().toString();
                String body = bodyEntry.getText().toString();
                JournalEntry journalEntry = new JournalEntry(title, body);
            }
        });
    }
}

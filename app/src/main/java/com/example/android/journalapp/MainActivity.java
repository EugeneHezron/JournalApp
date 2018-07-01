package com.example.android.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.UserData;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TITLE_KEY = "title";
    private static final String BODY_KEY = "body";
    private static final String ID_KEY = "id";
    private RecyclerView recyclerView;
    private JournalAdapter journalAdapter;
    LinearLayout entryContainer;
    ArrayList<JournalEntry> dataForRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entryContainer = (LinearLayout) findViewById(R.id.entry_layout_container);

        dataForRV= new ArrayList<JournalEntry>();
        dataForRV = getEntries();

        recyclerView = (RecyclerView) findViewById(R.id.rv_entries_list);
        journalAdapter = new JournalAdapter(dataForRV);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(journalAdapter);

        entryContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditActivity(view);
            }
        });

    }

    private void openEditActivity(View view) {
        int id = view.getId();
        JournalEntry journalEntry = dataForRV.get(id);
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra(TITLE_KEY, journalEntry.getEntryTitle());
        intent.putExtra(BODY_KEY, journalEntry.getEntryBody());
        intent.putExtra(ID_KEY, id);
        startActivity(intent);
    }

    private ArrayList<JournalEntry> getEntries() {

        ArrayList<JournalEntry> receivedEntries = new ArrayList<JournalEntry>();

        //Db code goes here
        receivedEntries.add(new JournalEntry("Test Entry","Hello World 1"));
        receivedEntries.add(new JournalEntry("Test Entry2","Hello World 1"));

        return receivedEntries;
    }


}

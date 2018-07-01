package com.example.android.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.UserData;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JournalAdapter journalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<JournalEntry> dataForRV= new ArrayList<JournalEntry>();
        dataForRV = getEntries();

        recyclerView = (RecyclerView) findViewById(R.id.rv_entries_list);
        journalAdapter = new JournalAdapter(dataForRV);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(journalAdapter);

    }

    private ArrayList<JournalEntry> getEntries() {

        ArrayList<JournalEntry> receivedEntries = new ArrayList<JournalEntry>();

        //Db code goes here
        receivedEntries.add(new JournalEntry("Test Entry","Hello World 1"));
        receivedEntries.add(new JournalEntry("Test Entry2","Hello World 1"));

        return receivedEntries;
    }


}

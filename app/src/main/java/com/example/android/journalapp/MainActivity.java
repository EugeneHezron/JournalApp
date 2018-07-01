package com.example.android.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    ArrayList<JournalEntry> journalEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getEntries();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_entries_list);
        JournalAdapter journalAdapter = new JournalAdapter(journalEntries);
        recyclerView.setAdapter(journalAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<JournalEntry> getEntries() {

        ArrayList<JournalEntry> receivedEntries = null;

        //Db code goes here

        return receivedEntries;
    }


}

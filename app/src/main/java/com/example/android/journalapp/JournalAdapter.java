package com.example.android.journalapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.EntryViewHolder> {

    private ArrayList<JournalEntry> mJournalEntries;

    public class EntryViewHolder extends RecyclerView.ViewHolder {

        private TextView entryTitle;
        private TextView entryBody;

        public EntryViewHolder(@NonNull View itemView) {

            super(itemView);

            entryTitle = (TextView) itemView.findViewById(R.id.tv_entry_title);
            entryBody = (TextView) itemView.findViewById(R.id.tv_entry_preview);
        }
    }

    public JournalAdapter(ArrayList<JournalEntry> fetchedEntries){
        mJournalEntries = fetchedEntries;
    }


    @NonNull
    @Override
    public EntryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.entry_instance, viewGroup, false);
        return new EntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EntryViewHolder entryViewHolder, int i) {
        JournalEntry journalEntry = mJournalEntries.get(i);

        TextView tvTitle = entryViewHolder.entryTitle;
        TextView tvBody = entryViewHolder.entryBody;

        tvTitle.setText(journalEntry.getEntryTitle());
        tvBody.setText(journalEntry.getEntryBody());
    }


    @Override
    public int getItemCount() {
        return mJournalEntries.size();
    }


}

package com.example.android.journalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.ViewHolder> {

    private ArrayList<JournalEntry> mJournalEntries;

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView entryTitle;
        public TextView entryBody;

        public ViewHolder(@NonNull View itemView) {

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
    public JournalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View singleJournalEntry = inflater.inflate(R.layout.entry_instance, parent, false);

        ViewHolder viewHolderInstance = new ViewHolder(singleJournalEntry);
        return viewHolderInstance;

    }

    @Override
    public void onBindViewHolder(@NonNull JournalAdapter.ViewHolder holder, int position) {

        JournalEntry journalEntry = mJournalEntries.get(position);

        TextView titleTextView = holder.entryTitle;
        titleTextView.setText(journalEntry.getEntryTitle());
        TextView bodyTextView = holder.entryBody;
        bodyTextView.setText(journalEntry.getEntryBody());
    }

    @Override
    public int getItemCount() {
        return mJournalEntries.size();
    }

}

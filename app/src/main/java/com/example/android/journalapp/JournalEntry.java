package com.example.android.journalapp;

public class JournalEntry {
    private String mEntryTitle;
    private String mEntryBody;

    public JournalEntry() {
    }

    public JournalEntry(String mEntryBody) {
        this.mEntryTitle = mEntryTitle;
        this.mEntryBody = mEntryBody;
    }

    public JournalEntry(String mEntryTitle, String mEntryBody) {
        this.mEntryTitle = mEntryTitle;
        this.mEntryBody = mEntryBody;
    }

    public String getEntryTitle() {
        return mEntryTitle;
    }

    public void setEntryTitle(String mEntryTitle) {
        this.mEntryTitle = mEntryTitle;
    }

    public String getEntryBody() {
        return mEntryBody;
    }

    public void setEntryBody(String mEntryBody) {
        this.mEntryBody = mEntryBody;
    }
}

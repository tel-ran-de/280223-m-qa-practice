package com.startainstitute.summary_0408.email;

import java.util.ArrayList;
import java.util.List;

public class FakeEmailSender implements EmailSender {

    private List<JournalEntry> journalEntryList = new ArrayList<>();

    @Override
    public void sendEmail(String email, String message) {
        journalEntryList.add(new JournalEntry(email, message));
    }

    public List<JournalEntry> getJournalEntryList() {
        return journalEntryList;
    }
}



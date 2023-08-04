package com.startainstitute.summary_0408.email;

public class JournalEntry {

    private final String email;
    private final String message;

    public JournalEntry(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }
}

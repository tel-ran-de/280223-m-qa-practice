package com.startainstitute.summary_0408.email;

import java.util.List;

public class Notifier {

    private final EmailSender emailSender;

    public Notifier(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendNotifications(List<User> users) {
        for (User user : users) {
            emailSender.sendEmail(user.getEmail(), "Hello, " + user.getName());
        }
    }
}

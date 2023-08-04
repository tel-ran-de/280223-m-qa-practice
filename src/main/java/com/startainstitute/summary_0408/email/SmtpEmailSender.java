package com.startainstitute.summary_0408.email;

public class SmtpEmailSender implements EmailSender {

    @Override
    public void sendEmail(String email, String message) {
        // SMTP connect, send data
        System.out.printf("I sent email to %s and message = %s\n", email, message);
    }
}

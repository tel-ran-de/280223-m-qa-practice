package com.startainstitute.summary_0408.email;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotifierTest {

    @Test
    void shouldSendEmails() {
        FakeEmailSender emailSender = new FakeEmailSender();
        Notifier notifier = new Notifier(emailSender);

        notifier.sendNotifications(List.of(
                new User("Anton", "none@none.ru"),
                new User("Ivan", "ivan@none.ru")
        ));

        assertEquals(2, emailSender.getJournalEntryList().size());
    }
}
package com.startainstitute.summary_0408.card;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        BankCardGenerator bankCardGenerator = new BankCardGenerator(ThreadLocalRandom.current());

        BankCard randomCard = bankCardGenerator.createRandomCard();

        BankClient bankClient = new BankClient("Anton", "Ermak", randomCard,
                new AccountBalance(new Currency("EUR"), BigDecimal.valueOf(10L)));
    }
}

package com.startainstitute.summary_0408.card;

import java.math.BigDecimal;

public class AccountBalance {
    private final Currency currency;
    private final BigDecimal amount;

    public AccountBalance(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}

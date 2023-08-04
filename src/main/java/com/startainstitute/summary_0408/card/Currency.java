package com.startainstitute.summary_0408.card;

import java.util.Objects;

public class Currency {

    private final String code;

    public Currency(String code) {
        if (code.length() > 3) {
            throw new IllegalArgumentException("Code length is too high");
        }
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(getCode(), currency.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
}

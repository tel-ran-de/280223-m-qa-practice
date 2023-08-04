package com.startainstitute.summary_1407.reports;

import java.math.BigDecimal;

public class SellItem {

    private final String article;
    private final BigDecimal price;
    private final int count;

    public SellItem(String article, BigDecimal price, int count) {
        this.article = article;
        this.price = price;
        this.count = count;
    }
}

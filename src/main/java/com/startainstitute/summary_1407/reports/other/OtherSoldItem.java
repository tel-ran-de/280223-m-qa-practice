package com.startainstitute.summary_1407.reports.other;

public class OtherSoldItem {

    private final String article;
    private final int price;


    public OtherSoldItem(String article, int price) {
        this.article = article;
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public int getPrice() {
        return price;
    }
}

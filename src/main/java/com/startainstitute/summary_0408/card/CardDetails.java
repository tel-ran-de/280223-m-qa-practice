package com.startainstitute.summary_0408.card;

import java.util.List;
import java.util.stream.Collectors;

public class CardDetails {

    private String details;

    public CardDetails(List<Integer> numbers, int month, int year, int cvv) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numbers.stream().map(Object::toString).collect(Collectors.joining("")));
        stringBuilder.append(month);
        stringBuilder.append(year);
        stringBuilder.append(cvv);
    }
}

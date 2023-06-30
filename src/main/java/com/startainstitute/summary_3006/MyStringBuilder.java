package com.startainstitute.summary_3006;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStringBuilder {

    private final List<String> substrings;
    private int totalParts;

    public MyStringBuilder(String init) {
        substrings = new ArrayList<>();
        substrings.add(init);
        totalParts = 0;
    }

    public MyStringBuilder append(String part) {
        substrings.add(part);
        totalParts += 1;
        return this;
    }

    public int getTotalParts() {
        return totalParts;
    }

    @Override
    public String toString() {
        return substrings.stream().collect(Collectors.joining());
    }
}

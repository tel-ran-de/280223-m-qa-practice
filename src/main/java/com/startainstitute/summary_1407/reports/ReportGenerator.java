package com.startainstitute.summary_1407.reports;

import java.time.ZonedDateTime;
import java.util.List;

public class ReportGenerator {

    private final SoldItemsProvider soldItemsProvider;

    public ReportGenerator(SoldItemsProvider soldItemsProvider) {
        this.soldItemsProvider = soldItemsProvider;
    }

    ReportResult generateReport(ZonedDateTime from, ZonedDateTime to) {
        List<SellItem> items = soldItemsProvider.load(from, to);
        // generate report
        return new ReportResult();
    }
}

class ReportResult {
}

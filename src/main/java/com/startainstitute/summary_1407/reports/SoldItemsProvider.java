package com.startainstitute.summary_1407.reports;

import java.time.ZonedDateTime;
import java.util.List;

public interface SoldItemsProvider {

    List<SellItem> load(ZonedDateTime from, ZonedDateTime to);
}

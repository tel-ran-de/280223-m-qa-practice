package com.startainstitute.summary_1407.reports;

import com.startainstitute.summary_1407.reports.other.ItemsProvider;
import com.startainstitute.summary_1407.reports.other.OtherSoldItem;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SoldItemsProviderImpl implements SoldItemsProvider {

    private final ItemsProvider itemsProvider;

    public SoldItemsProviderImpl(ItemsProvider itemsProvider) {
        this.itemsProvider = itemsProvider;
    }

    @Override
    public List<SellItem> load(ZonedDateTime from, ZonedDateTime to) {
        Map<ZonedDateTime, List<OtherSoldItem>> items = itemsProvider.getItems(from, to);

        return items.values().stream()
                .flatMap(Collection::stream)
                .map(elem -> new SellItem(elem.getArticle(), new BigDecimal(elem.getPrice()), 1))
                .collect(Collectors.toList());
    }
}

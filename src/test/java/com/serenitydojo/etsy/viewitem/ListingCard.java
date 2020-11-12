package com.serenitydojo.etsy.viewitem;

public class ListingCard {
    private final String title;
    private final String dataListingId;

    public ListingCard(String title, String dataListingId) {
        this.title = title;
        this.dataListingId = dataListingId;
    }

    public String getTitle() {
        return title;
    }

    public String getDataListingId() {
        return dataListingId;
    }
}

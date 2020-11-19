package com.serenitydojo.etsy.viewitem;

public class ListingCard {
    private final String title;
    private final String dataListingId;
    private final String price;

    public ListingCard(String title, String price, String dataListingId) {
        this.title = title;
        this.price = price;
        this.dataListingId = dataListingId;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getDataListingId() {
        return dataListingId;
    }
}

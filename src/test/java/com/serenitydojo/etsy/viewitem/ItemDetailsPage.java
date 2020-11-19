package com.serenitydojo.etsy.viewitem;

import net.serenitybdd.screenplay.targets.Target;

public class ItemDetailsPage {
    public static final Target ITEM_TITLE = Target.the("Item Title").locatedBy("#listing-page-cart h1");
    public static final Target ITEM_PRICE = Target.the("Item Price").locatedBy("#listing-page-cart div[data-buy-box-region='price']");
}

package com.serenitydojo.etsy.viewitem;

import com.serenitydojo.etsy.navigation.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ViewItemDetails implements Performable {
    private final Target LISTING_CARD = Target.the("listing card with id {0}")
                                              .locatedBy("//a[@data-listing-id='{0}']");

    public ViewItemDetails() {}

    public static Performable forOneOfTheDisplayedItems() {
        return new ViewItemDetails();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<ListingCard> listingCards = actor.asksFor(DisplayedListingCard.details());
        ListingCard selectedItem = randomItemFrom(listingCards);
        actor.remember("SELECTED_ITEM", selectedItem);

        actor.attemptsTo(
                Click.on(LISTING_CARD.of(selectedItem.getDataListingId())),
                Navigate.toTheOtherTab()
        );
    }

    private ListingCard randomItemFrom(List<ListingCard> itemTitles) {
        int maxItem = Math.min(10, itemTitles.size());
        int chosenTitle = (int) (Math.random() * maxItem);
        return itemTitles.get(chosenTitle);
    }
}

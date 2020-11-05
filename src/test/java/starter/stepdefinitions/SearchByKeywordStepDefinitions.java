package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.assertj.core.api.Assertions;
import starter.navigation.NavigateTo;
import starter.search.DisplayedItems;
import starter.search.SearchForProducts;
import starter.viewitem.ListedItemDetails;
import starter.viewitem.ViewItemDetails;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchByKeywordStepDefinitions {
    @Given("{actor} is looking for products on Esty")
    public void lookingForProductsOnEtsy(Actor actor) {
        actor.attemptsTo(
                NavigateTo.toEtsySearchPage()
        );
    }

    @When("{actor} searches for {string}")
    public void searchesForProduct(Actor actor, String keyword) {
        actor.attemptsTo(
              SearchForProducts.withKeyword(keyword)
        );
    }

    @Then("{actor} should only be shown products related to {string}")
    public void shouldSeeProductsAbout(Actor actor, String keyword) {
        List<String> displayedDescriptions =
                actor.asksFor(DisplayedItems.descriptions());

        assertThat(displayedDescriptions).allMatch(
                description -> description.toLowerCase()
                                          .contains(keyword.toLowerCase())
        );
    }

    @Given("{actor} has performed a search for {string}")
    public void hasPerformedASearchFor(Actor actor, String keyword) {
        actor.attemptsTo(
            NavigateTo.toEtsySearchPage(),
            SearchForProducts.withKeyword(keyword)
        );
    }

    @When("{actor} views the details for the first listed item")
    public void viewsTheDetailsForTheFirstListedItem(Actor actor) {
        actor.attemptsTo(
                ViewItemDetails.forItemNumber(1)
        );
        //String listedItem = actor.asksFor(ListedItemDetails.title());
        //System.out.println(listedItem);
    }
}

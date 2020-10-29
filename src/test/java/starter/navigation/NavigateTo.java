package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class NavigateTo {
    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

    public static Performable toEtsySearchPage() {
        return Task.where("{0} opens the Etsy home page",
                Open.url("https://www.etsy.com/"),
                WaitUntil.the(CookieDialog.ACCEPT_BUTTON, isClickable()),
                DoubleClick.on(CookieDialog.ACCEPT_BUTTON)
        );
    }
}

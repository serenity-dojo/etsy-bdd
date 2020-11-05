package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable toEtsySearchPage() {
        return Task.where("{0} opens the Etsy home page",
                Open.url("https://www.etsy.com/"),
                DoubleClick.on(CookieDialog.ACCEPT_BUTTON)
        );
    }
}

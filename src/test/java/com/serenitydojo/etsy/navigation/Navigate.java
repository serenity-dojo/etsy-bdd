package com.serenitydojo.etsy.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Navigate {
    public static Performable toTheHomePage() {

        return Task.where("{0} opens the Etsy home page",
                Open.url("https://www.etsy.com/"),
                Check.whether(the(CookieDialog.ACCEPT_BUTTON), isCurrentlyVisible())
                        .andIfSo(DoubleClick.on(CookieDialog.ACCEPT_BUTTON))
        );
    }

    public static Performable toTheYourProfilePage() {
        return Task.where("{0} views their profile details",
                Click.on(MenuBar.PROFILE_PIC).then(Click.on(MenuBar.VIEW_YOUR_PROFILE))
        );
    }

    public static Performable toMyFavorites() {
        return Task.where("{0} views the My Favorites section",
                Click.on(MenuBar.FAVORITES)
        );
    }

    public static Performable toTheShoppingBasket() {
        return Task.where("{0} views the shopping basket",
                Click.on(MenuBar.BASKET)
        );
    }
}






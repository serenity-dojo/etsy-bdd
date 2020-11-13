package com.serenitydojo.etsy.navigation;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

class MenuBar {
    static Target PROFILE_PIC = Target.the("Profile picture").locatedBy(".nav-icon-circle");
    static Target VIEW_YOUR_PROFILE = Target.the("View your profile link")
                                                   .located(By.partialLinkText("View your profile"));
    static Target BASKET = Target.the("Shopping Basket Icon").locatedBy("a[href*='/cart']");
    static Target FAVORITES = Target.the("My Favorites Icon").locatedBy("li.favorites a");
}



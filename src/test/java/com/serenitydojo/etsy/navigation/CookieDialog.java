package com.serenitydojo.etsy.navigation;

import net.serenitybdd.screenplay.targets.Target;

class CookieDialog {
    static final Target ACCEPT_BUTTON = Target.the("Accept cookies")
                                              .locatedBy("//button[contains(.,'Accept')]");
}



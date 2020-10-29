package starter.navigation;

import net.serenitybdd.screenplay.targets.Target;

public class CookieDialog {
    public static final Target ACCEPT_BUTTON = Target.the("Accept cookies")
            .locatedBy("//button[contains(.,'Accept')]");
}

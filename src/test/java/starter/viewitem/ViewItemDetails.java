package starter.viewitem;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.JavaScript;
import org.openqa.selenium.By;

public class ViewItemDetails implements Performable {
    //private static final String LISTED_ITEM = "(//div[contains(@class,'v2-listing-card')]/a)";

    private int itemNumber;

    public ViewItemDetails() {}

    public ViewItemDetails(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public static Performable forItemNumber(int itemNumber) {
        return new ViewItemDetails(itemNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.xpath("(//div[contains(@class,'v2-listing-card')]/a)" + "[" + itemNumber + "]"))
        );
    }
}

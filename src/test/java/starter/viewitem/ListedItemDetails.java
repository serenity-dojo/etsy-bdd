package starter.viewitem;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ListedItemDetails {
    public static Question<String> title() {
        return Text.of(ItemDetailsPage.ITEM_TITLE).asAString();
    }
}

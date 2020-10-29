package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class DisplayedItems {
    public static Question<List<String>> descriptions() {
        return Text.of(SearchResultBox.TITLE).asAList();
    }
}
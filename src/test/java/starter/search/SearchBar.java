package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBar {
    public static final Target SEARCH_FIELD = Target.the("Search field")
            .located(By.name("search_query"));
}

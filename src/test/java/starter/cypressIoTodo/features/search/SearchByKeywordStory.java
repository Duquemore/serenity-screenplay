package starter.cypressIoTodo.features.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.cypressIoTodo.tasks.OpenTheApplication;
import starter.cypressIoTodo.tasks.Search;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;

@ExtendWith(SerenityJUnit5Extension.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @BeforeEach
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void seach_results_should_show_the_search_term_in_the_title() {

        givenThat(anna).wasAbleTo(openTheApplication);

        when(anna).attemptsTo(Search.forTheTerm("BDD In Action"));

        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("BDD In Action"))));

    }
}

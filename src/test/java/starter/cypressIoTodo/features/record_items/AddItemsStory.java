package starter.cypressIoTodo.features.record_items;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.cypressIoTodo.questions.TheTodoItems;
import starter.cypressIoTodo.tasks.AddATodoItem;
import starter.cypressIoTodo.tasks.StartWith;
import net.serenitybdd.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;

@ExtendWith(SerenityJUnit5Extension.class)
public class AddItemsStory {

    Actor justin = Actor.named("Justin");

    @Managed
    public WebDriver hisBrowser;

    @BeforeEach
    public void annaCanBrowseTheWeb() {
        justin.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_be_able_to_add_an_item_to_the_todo_list() {

        givenThat(justin).wasAbleTo(StartWith.anEmptyTodoList());

        when(justin).attemptsTo(AddATodoItem.called("Feed the cat"));

        then(justin).should(seeThat(TheTodoItems.displayed(), hasItem("Feed the cat")));
    }

    @Test
    public void should_be_able_to_add_an_item_to_a_todo_list_with_existing_items() {

        givenThat(justin).wasAbleTo(StartWith.aTodoListContaining("Feed the cat","take out the garbage"));

        when(justin).attemptsTo(AddATodoItem.called("Walk the dog"));

        then(justin).should(seeThat(TheTodoItems.displayed(), contains("Feed the cat","take out the garbage","Walk the dog")));
    }

}

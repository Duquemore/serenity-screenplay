package starter.cypressIoTodo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.cypressIoTodo.ui.TodoMvcApplicationHomePage;
import net.serenitybdd.annotations.Step;

public class StartWithAnEmptyList implements Task {

    TodoMvcApplicationHomePage todoMvcApplicationHomePage;

    @Override
    @Step("{0} starts with an empty todo list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(todoMvcApplicationHomePage));
    }
}
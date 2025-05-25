package starter.cypressIoTodo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.cypressIoTodo.ui.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class TheTodoItems implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return new ArrayList<>(Text.ofEach(ToDoList.ITEMS).answeredBy(actor));
    }

    public static Question<List<String>> displayed() {
        return new TheTodoItems();
    }
}

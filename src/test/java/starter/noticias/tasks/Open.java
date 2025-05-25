package starter.noticias.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.noticias.ui.HomePage;
import starter.noticias.ui.Menu;

public class Open {
    public static Performable menu() {
        return Task.where("{0} clicks the menu icon",
                Click.on(HomePage.hamburguerMenu()));
    }

    public static Performable hardware() {
        return Task.where("{0} clicks the menu icon",
                Click.on(Menu.hardware()));
    }
}

package starter.noticias.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.noticias.ui.HomePage;

public class Close {
    public static Performable popup() {
        return Task.where("{0} clicks the close button of the popup",
                Click.on(HomePage.popUpCloseButton()));
    }
}

package starter.noticias.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Menu {
    public static Target hardware() {
        return Target.the("Menu Hardware option")
                .locatedBy("#computing [href=\"https://www.technewsworld.com/section/computing/hardware\"]");
    }
}

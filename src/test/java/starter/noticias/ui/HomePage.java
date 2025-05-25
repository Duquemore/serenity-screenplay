package starter.noticias.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target popUpCloseButton() {
        return Target.the("Pop up close button")
                .locatedBy(".pum-close.popmake-close");
    }

    public static Target hamburguerMenu() {
        return Target.the("Hamburguer menu")
                .locatedBy(".d-sm-flex .menu-sec2.mob-kk");
    }
}

package starter.noticias.ui;
import net.serenitybdd.screenplay.targets.Target;

public class Hardware {
    public static Target articles() {
        return Target.the("Hardware articles")
                .locatedBy(".search-item");
    }
}

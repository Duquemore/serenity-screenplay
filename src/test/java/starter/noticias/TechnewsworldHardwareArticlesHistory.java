package starter.noticias;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.noticias.tasks.Close;
import starter.noticias.tasks.Navigate;
import starter.noticias.tasks.Open;
import starter.noticias.ui.Hardware;

@WithTag("HardwareArticles")
@ExtendWith(SerenityJUnit5Extension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TechnewsworldHardwareArticlesHistory {

    @CastMember(name = "Louis")
    Actor louis;

    @WithTag("Selenium")
    @Test
    @Order(1)
    public void visitHardwareArticles() {
        louis.attemptsTo(
                Navigate.toTheHomePage(),
                Close.popup(),
                Open.menu(),
                Open.hardware(),
                Ensure.thatTheListOf(Hardware.articles()).hasSizeGreaterThan(14));
    }
}

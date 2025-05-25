package starter.wikipedia;

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

@WithTag("Search")
@ExtendWith(SerenityJUnit5Extension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SeleniumWikipediaSearchStory {

    @CastMember(name = "Steve")
    Actor steve;

    @WithTag("Selenium")
    @Test
    @Order(1)
    public void searchForSeleniumArticles() {
        steve.attemptsTo(
                Navigate.toTheHomePage(),
                Search.byKeyword("Selenium software"),
                Ensure.thatTheListOf(SearchResults.results()).hasSizeGreaterThan(3));
    }

    @WithTag("WikipediaArticle")
    @Test
    @Order(2)
    public void verifyFirstSeleniumArticleContent() {
        steve.attemptsTo(
                Navigate.toTheHomePage(),
                Search.byKeyword("Selenium software"),
                Select.firstResult(),
                Ensure.that(Article.content()).textContent().contains("Selenium"));
    }
}

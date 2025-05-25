package starter.sauceDemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    // Campos del formulario de Checkout
    public By firstName = By.id("first-name");
    public By lastName = By.id("last-name");
    public By postalCode = By.id("postal-code");

    // Botón para continuar con el checkout
    public By continueButton = By.id("continue");

    // Botón para finalizar la compra
    public By finishButton = By.id("finish");
}
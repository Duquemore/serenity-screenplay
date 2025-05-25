package starter.sauceDemo.actions;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class BuyProductActions extends UIInteractions {

    public void selectRandomProduct() {
        // Selecciona dos productos aleatorios y le hace click
        find(By.xpath("//button[contains(text(), 'Add to car')]")).click();
        find(By.xpath("//button[contains(text(), 'Add to car')]")).click();

    }

    public void proceedToCheckout() {
        // Va al carrito y luego al checkout
        find(By.xpath("//a[@class='shopping_cart_link']")).click();
        find(By.id("checkout")).click();
    }

    public void fillInCheckoutForm(String firstName, String lastName, String postalCode) {
        // Llena el formulario de datos personales
        find(By.id("first-name")).sendKeys(firstName);
        find(By.id("last-name")).sendKeys(lastName);
        find(By.id("postal-code")).sendKeys(postalCode);
        find(By.id("continue")).click();
    }

    public void finishPurchase() {
        // Finaliza la compra
        find(By.id("finish")).click();
    }
}
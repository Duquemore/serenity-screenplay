package starter.sauceDemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    // Botones para agregar productos al carrito
    public By addToCartButtons = By.cssSelector(".inventory_item button");

    // Botón para ir al carrito
    public By cartButton = By.cssSelector(".shopping_cart_link");

    // Botón de Checkout en el carrito
    public By checkoutButton = By.id("checkout");
}
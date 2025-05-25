package starter.sauceDemo.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.sauceDemo.actions.BuyProductActions;
import starter.sauceDemo.actions.LoginActions;
import starter.sauceDemo.pages.ConfirmationPage;
import starter.sauceDemo.models.User;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenBuyingAProduct {

    @Steps
    LoginActions login;
    BuyProductActions buyProduct;
    ConfirmationPage confirmationPage;

    @Test
    public void userCanBuyAProduct() {
        // Paso 1: Iniciar sesión como usuario estándar
        login.as(User.STANDARD_USER);

        // Paso 2: Seleccionar un producto aleatorio y agregarlo al carrito
        buyProduct.selectRandomProduct();

        // Paso 3: Proceder al checkout
        buyProduct.proceedToCheckout();

        // Paso 4: Llenar el formulario de compra
        buyProduct.fillInCheckoutForm("Pablin", "Arancibia", "12345");

        // Paso 5: Finalizar la compra
        buyProduct.finishPurchase();

        // Verificar que la página de confirmación muestra el mensaje correcto
        Serenity.reportThat("The Confirmation Page should include the correct text", () -> assertThat(confirmationPage.mensaje()).isEqualToIgnoringCase("thank you for your order!"));
    }
}
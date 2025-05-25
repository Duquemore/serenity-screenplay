package starter.sauceDemo.tests;


import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.sauceDemo.actions.BuyProductActions;
import starter.sauceDemo.actions.DeleteProductActions;
import starter.sauceDemo.actions.LoginActions;
import starter.sauceDemo.models.User;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenDeletingAProductFromCart {

    @Steps
    LoginActions login;
    BuyProductActions buyProduct;
    DeleteProductActions deleteProduct;

    @Test
    public void userCanDeleteAProductFromCart(){

        //Paso 1: Iniciar sesión como usuario estandar
        login.as(User.STANDARD_USER);

        //Paso 2: Selecciónar un producto aleatorio
        buyProduct.selectRandomProduct();

        //Paso 3: Sacar el producto del carrito
        deleteProduct.uncheckProduct();

        //Paso 4: Ir hacia el carrito
        buyProduct.proceedToCheckout();

        //Paso 5: Comprobar que esté vacio
        Serenity.reportThat("", () -> assertThat(deleteProduct.isCartEmpty()).isTrue());


    }

}

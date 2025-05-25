package starter.sauceDemo.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.sauceDemo.models.User;
import starter.sauceDemo.pages.InventoryPage;
import starter.sauceDemo.actions.LoginActions;


import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLogginIn{


    @Steps
    LoginActions login;
    InventoryPage inventoryPage;


    @Test
    public void userCanLogInViaTheHomePage()
    {
        // Paso 1: Realizamos el login con Standard User
        login.as(User.STANDARD_USER);

        //Paso 2: Comprobamos que inicio correctamente
        Serenity.reportThat("The Inventory page should include the correct text", () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );


    }


}

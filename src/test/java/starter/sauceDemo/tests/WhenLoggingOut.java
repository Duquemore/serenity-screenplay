package starter.sauceDemo.tests;

/*
1. Iniciar sesión:
Realizar el login con un usuario válido.
2. Abrir el menú de opciones:
Hacer clic en el icono del menú (generalmente ubicado en la esquina superior izquierda o derecha de la pantalla).
3. Seleccionar la opción de cerrar sesión:
Hacer clic en el botón "Logout" o "Cerrar sesión" del menú.
4. Verificar redirección a la página de inicio de sesión:
Confirmar que el usuario es redirigido correctamente a la página de login y que la sesión ha sido cerrada.
 */

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.sauceDemo.actions.LoginActions;
import starter.sauceDemo.actions.LogoutActions;
import starter.sauceDemo.models.User;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOut {


    @Steps
    LoginActions login;
    LogoutActions logout;


    @Test
    public void userCanLogout(){

        //Paso 1: Iniciar sesión como usuario estandar
        login.as(User.STANDARD_USER);

        //Paso 2: Abrir el menu de opciones
        logout.openMenu();

        //Paso 3: Cerrar la sesión
        logout.logout();

        //Paso 4: Obtener la URL y Verificar la redirección
        String currentUrl = getDriver().getCurrentUrl();
        Serenity.reportThat("The logout was succesful", () -> assertThat(currentUrl).isEqualTo("https://www.saucedemo.com/"));

    }

}

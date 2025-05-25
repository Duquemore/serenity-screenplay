package starter.sauceDemo.actions;



import net.serenitybdd.core.steps.UIInteractions;

import org.openqa.selenium.By;
//ESTAS IMPORTACIONES SON NECESARIAS SI UTILIAMOS OPCIÓN 2
//import org.openqa.selenium.support.FindBy;
//import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutActions extends UIInteractions {

    public void openMenu(){
        //Abre el menu
        find(By.xpath("//button[@id='react-burger-menu-btn']")).click();
    }

    public void logout(){
        //Aprieta el boton de logout
        find(By.xpath("//a[@id='logout_sidebar_link']")).click();
    }
}
/* OPCIÓN 2 DE IMPLEMENTACIÓN
En las versiones actuales de Serenity, la mejor práctica es usar anotaciones de Page Object 
combinadas con WebElementFacade, que ofrece más funcionalidades y estabilidad.

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElementFacade menuButton;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElementFacade logoutButton;

    public void openMenu() {
        menuButton.click();
    }

    public void logout() {
        logoutButton.click();
    }

}
 */
package starter.sauceDemo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {

    // Mensaje de confirmación
    public String mensaje(){
        return find(By.xpath("//h2[@class='complete-header']")).getText();
    }

}
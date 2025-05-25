package starter.sauceDemo.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

import java.util.List;

public class DeleteProductActions extends UIInteractions {

    public void uncheckProduct(){
        //Selecciona 2 productos para desmarcarlos y sacarlos del carrito
        find(By.xpath("//button[contains(text(), 'Remove')]")).click();
        find(By.xpath("//button[contains(text(), 'Remove')]")).click();
    }

    public Boolean isCartEmpty()
    {
        List<WebElementFacade> cartItems = findAll(By.xpath("//div[@class='cart_item']"));
        return cartItems.isEmpty();
    }



}

package starter.sauceDemo.pages;

import net.serenitybdd.core.pages.PageObject;

public class InventoryPage extends PageObject{

    public String getHeading(){
        return find(".title").getText();
    }


}

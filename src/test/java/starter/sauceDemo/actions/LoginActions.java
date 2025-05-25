package starter.sauceDemo.actions;

import net.serenitybdd.core.steps.UIInteractions;
import starter.sauceDemo.models.User;

public class LoginActions extends UIInteractions {

    public void as(User user){

        openUrl("https://www.saucedemo.com/");

        find("[data-test='username']").sendKeys(user.getUsername());
        find("[data-test='password']").sendKeys(user.getPassword());
        find("[data-test='login-button']").click();



    }



}

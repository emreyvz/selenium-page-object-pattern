package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    public LoginPage setUsername(String userName){
        sendKeys(username, userName);
        return this;
    }

    public LoginPage setPassword(String passWord){
        sendKeys(password, passWord);
        return this;
    }

    public LoginPage clickLogin(){
        click(LoginButton);
        return this;
    }

}

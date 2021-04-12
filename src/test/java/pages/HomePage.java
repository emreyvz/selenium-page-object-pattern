package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsHomepage.*;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }

    public HomePage moveToAuth(){
        hoverElement(AuthButton);
        return this;
    }

    public HomePage ClickLogin(){
        click(LoginButton);
        return this;
    }

    public HomePage sendQuery(String value){
        sendKeys(searchTextbox, value);
        return this;
    }

    public HomePage ClickSearchButton(){
        click(searchButton);
        return this;
    }

}

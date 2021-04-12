package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static constants.ConstantsBasketPage.*;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver webDriver){
        super(webDriver);
    }

    public BasketPage increaseQuantity(){
        Select dropdown = new Select(findElement(quantitySelectBox));
        dropdown.selectByVisibleText("2");
        return this;
    }

    public String getTotalPrice(){
        return findElement(totalPrice).getText();
    }

    public String getTotalQuantity(){
        return findElement(totalQuantity).getText();
    }

    public void removeAllItemsFromBasket(){
        click(removeButton);
    }

    public String getStatement(){
        return findElement(basketClearStatement).getText();
    }

}

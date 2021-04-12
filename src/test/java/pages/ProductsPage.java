package pages;
import base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static constants.ConstantsProductsPage.*;

public class ProductsPage extends BasePage {
    public String choosedProductPrice;
    public ProductsPage(WebDriver webDriver){
        super(webDriver);
    }

    public ProductsPage redirectSecondPage(){
        clickWithEvent(secondPageButton);
        return this;
    }

    public ProductsPage chooseRandomAndRedirect(){
        List<WebElement> products = findElements(product);
        Random rand = new Random();
        int randomIndex = rand.nextInt(products.size());
        WebElement randomProduct = products.get(randomIndex);
        this.choosedProductPrice = products.get(randomIndex).getText();
        randomProduct.click();
        return this;
    }

    public String getChoosedProductPrice(){
        return this.choosedProductPrice;
    }




}

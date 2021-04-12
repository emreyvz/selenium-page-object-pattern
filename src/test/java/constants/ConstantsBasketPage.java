package constants;

import org.openqa.selenium.By;

public class ConstantsBasketPage {
    public static final By totalPrice = By.xpath("//div[@class='gg-d-8 detail-price']");
    public static final By quantitySelectBox = By.xpath("//select[@class='amount']");
    public static final By totalQuantity = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By removeButton = By.xpath("//a[@class='btn-delete btn-update-item']");
    public static final By basketClearStatement = By.xpath("//div[@id='empty-cart-container'][@class='clearfix']");
}

package constants;
import org.openqa.selenium.By;

public class ConstantsProductsPage {
    public static final By secondPageButton = By.xpath("/html[@class='js-ready csstransforms3d csstransitions']/body[@class='desktop']/div[@class='gray-content']/div[@class='container ']/div[@id='best-match']/div[@id='best-match-right']/div[@class='pager pt30 hidden-m gg-d-24']/ul[@class='clearfix']/li[2]/a");
    public static final By selectedSecondPageButton = By.xpath("/html[@class='js-ready csstransforms3d csstransitions']/body[@class='desktop']/div[@class='gray-content']/div[@class='container ']/div[@id='best-match']/div[@id='best-match-right']/div[@class='pager pt30 hidden-m gg-d-24']/ul[@class='clearfix']/li[@class='selected']/a[@class='current']");
    public static final By product = By.className("product-link");
    public static final By priceTag = By.xpath("//p[@class='fiyat robotobold price-txt']");

}

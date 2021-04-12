package test;

import base.BaseTest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import models.user;
import static constants.ConstantsProductsPage.*;
import static constants.ConstantsHomepage.*;

public class mainTest extends BaseTest {
    HomePage homepage;
    LoginPage loginPage;
    ProductsPage ProductsPage;
    SpecificProductPage SpecificProductPage;
    BasketPage BasketPage;
    private static Logger logger = LogManager.getLogger(mainTest.class);

    @Before
    public void before(){
        homepage = new HomePage(getWebDriver());
        loginPage = new LoginPage(getWebDriver());
        ProductsPage = new ProductsPage(getWebDriver());
        SpecificProductPage = new SpecificProductPage(getWebDriver());
        BasketPage = new BasketPage(getWebDriver());
    }

    @Test
    public void test(){
        user user = new user("gittigidiyor@mailsac.com", "123456asd");
        Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", getWebDriver().getTitle());
        logger.info("Gittigidiyor loaded successfully");
        homepage.moveToAuth().ClickLogin();
        loginPage.setUsername(user.getUsername()).setPassword(user.getPassword()).clickLogin();
        Assert.assertTrue(homepage.getText(myAccountText).contains("Hesabım"));
        logger.info("Login successful");
        homepage.sendQuery("bilgisayar").ClickSearchButton();
        ProductsPage.redirectSecondPage();
        Assert.assertEquals(ProductsPage.getText(selectedSecondPageButton), "2");
        logger.info("Page 2 loaded successfully");
        ProductsPage.chooseRandomAndRedirect();
        SpecificProductPage.addToBasket().redirectToBasket();
        Assert.assertTrue(ProductsPage.getChoosedProductPrice().contains(BasketPage.getTotalPrice()));
        logger.info("Product price in basket and price that shown in product page are same.");
        BasketPage.increaseQuantity();
        BasketPage.removeAllItemsFromBasket();
    }

    @After
    public void after(){
       tearDown();
    }
}

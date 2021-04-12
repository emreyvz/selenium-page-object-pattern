package constants;
import org.openqa.selenium.By;

public class ConstantsHomepage {
    public static final By Title = By.xpath("//title");
    public static final By AuthButton = By.name("profile");
    public static final By LoginButton = By.xpath("//a[@data-cy='header-login-button']");
    public static final By myAccountText = By.xpath("//div[@title='Hesabım']");
    public static final By searchTextbox = By.name("k");
    public static final By searchButton = By.xpath("//button[@data-cy='search-find-button']");
}

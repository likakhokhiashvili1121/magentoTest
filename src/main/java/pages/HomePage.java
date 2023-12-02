package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//li[@class='authorization-link']//a)[1]")
    private WebElement signInButton;

    @FindBy(xpath = "(//li//a[contains(@href,'/create/')])[1]")
    private WebElement createAccountButton;

    @FindBy(xpath = "(//button[@data-action='customer-menu-toggle'])[1]")
    private WebElement customerMenuButton;

    @FindBy(xpath = "(//li//a[contains(@href,'/account/')])[1]")
    private WebElement myAccountButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Get the Header section
    public Header getHeader() {
        return new Header(driver);
    }

    public void navigateTo() {
        driver.get(ConfigProperties.getProperty("home.page-url"));
    }

    public LogInPage navigateToSignInPage() {
        signInButton.click();
        return new LogInPage(driver);
    }

    public CreateAccountPage navigateToCreateAccountPage() {
        createAccountButton.click();
        return new CreateAccountPage(driver);
    }

    public AccountPage navigateToAccountPage() {
        customerMenuButton.click();
        myAccountButton.click();
        return new AccountPage(driver);
    }
}

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LogInPage;
import utils.ConfigProperties;

import static org.testng.Assert.assertTrue;

@Epic("Login Feature")
@Feature("Customer Login")
public class LoginTest extends BaseTest {

    @Test
    @Story("Logging in as a customer")
    @Description("Test to verify customer login functionality")
    public void loginCustomerTest() {
        LogInPage signInPage = homePage.navigateToSignInPage();
        signInPage.loginToAccount(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        homePage.navigateToAccountPage();
        AccountPage accountPage = new AccountPage(driver);

        assertTrue(accountPage.isDisplayed(), "Authorization failed!");
    }
}
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LogInPage;
import utils.ConfigProperties;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void loginCustomerTest() {
        LogInPage signInPage = homePage.navigateToSignInPage();
        signInPage.loginToAccount(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        homePage.navigateToAccountPage();
        AccountPage accountPage = new AccountPage(driver);

        assertTrue(accountPage.isDisplayed(), "Authorization failed!");
    }
}
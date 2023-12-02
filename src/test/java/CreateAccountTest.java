import data.CustomerAccount;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CreateAccountPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createNewAccountTest() {
        CustomerAccount randomUserAccount = CustomerAccount.createFakeAccount();

        CreateAccountPage createAccountPage = homePage.navigateToCreateAccountPage();
        createAccountPage.finishRegistration(randomUserAccount);
        AccountPage accountPage = new AccountPage(driver);


        assertTrue(accountPage.isDisplayed(), "Authorization failed");
    }
}
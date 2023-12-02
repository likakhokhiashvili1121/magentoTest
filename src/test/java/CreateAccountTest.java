import data.CustomerAccount;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CreateAccountPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;
@Epic("Create Account Feature")
@Feature("Create a new customer account")
public class CreateAccountTest extends BaseTest {

    @Test
    @Story("Creating a new customer account")
    @Description("Test to verify the creation of a new customer account")
    public void createNewAccountTest() {
        CustomerAccount randomUserAccount = CustomerAccount.createFakeAccount();

        CreateAccountPage createAccountPage = homePage.navigateToCreateAccountPage();
        createAccountPage.finishRegistration(randomUserAccount);
        AccountPage accountPage = new AccountPage(driver);


        assertTrue(accountPage.isDisplayed(), "Authorization failed");
    }
}
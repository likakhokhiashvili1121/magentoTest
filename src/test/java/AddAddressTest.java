import org.testng.annotations.Test;
import pages.AccountPage;
import pages.AddressBookPage;
import pages.LogInPage;
import utils.ConfigProperties;
import utils.CustomerAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.Assert.assertTrue;

public class AddAddressTest extends BaseTest {

    @Test
    public void addCustomerAddressTest() {
        CustomerAddress customerAddress = new CustomerAddress("1234567890", "V.godziashvili 38g", "Tbilisi", "12345", "Georgia");

        LogInPage signInPage = homePage.navigateToSignInPage();
        signInPage.loginToAccount(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        AccountPage accountPage = homePage.navigateToAccountPage();
        AddressBookPage addressBookPage = accountPage.navigateToAddressBookPage();

        addressBookPage.createNewAddress(customerAddress);

        // Assertions
        assertAll(
                () -> assertTrue(addressBookPage.isDisplayed(), "Element not found"),
                () -> assertEquals(customerAddress.getPhoneNumber(), addressBookPage.createdPhoneNumber()),
                () -> assertEquals(customerAddress.getStreet(), addressBookPage.createdStreet()),
                () -> assertEquals(customerAddress.getCity(), addressBookPage.createdCity()),
                () -> assertEquals(customerAddress.getPostalCode(), addressBookPage.createdPostalCode()),
                () -> assertEquals(customerAddress.getCountry(), addressBookPage.createdCountry())
        );
    }
}

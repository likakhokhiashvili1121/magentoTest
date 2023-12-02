import org.testng.annotations.Test;
import pages.CartPage;
import pages.LogInPage;
import utils.ConfigProperties;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.Assert.assertTrue;
import static utils.Const.*;


public class AddProductToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        LogInPage signInPage = homePage.navigateToSignInPage();
        signInPage.loginToAccount(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));

        homePage.getHeader().chooseCategoryMenu(WOMEN_CATEGORY, BOTTOMS_SUB_CATEGORY, PANTS_SUB_CATEGORY).selectRandomProduct().addProductToCart();
        homePage.getHeader().chooseCategoryMenu(MEN_CATEGORY, TOPS_SUB_CATEGORY, JACKETS_SUB_CATEGORY).selectRandomProduct().addProductToCart();
        homePage.getHeader().chooseCategoryMenu(WOMEN_CATEGORY, TOPS_SUB_CATEGORY, JACKETS_SUB_CATEGORY).selectRandomProduct().addProductToCart();

        CartPage cartPage = homePage.getHeader().clickCartButton();

        assertAll(
                () -> assertTrue(cartPage.isDisplayed(), "Element not found"),
                () -> assertTrue(cartPage.checkOrderTotals(), "Values in order are wrong!")
        );
    }
}
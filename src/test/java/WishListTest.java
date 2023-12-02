import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ProductPage;
import pages.LogInPage;
import pages.WishListPage;
import utils.ConfigProperties;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.Assert.assertTrue;
import static utils.Const.*;

public class WishListTest extends BaseTest {

    @Test
    public void addProductToWishListTest() {
        LogInPage signInPage = homePage.navigateToSignInPage();
        signInPage.loginToAccount(ConfigProperties.getProperty("login"), ConfigProperties.getProperty("password"));
        IndexPage indexPage = homePage.getHeader().chooseCategoryMenu(WOMEN_CATEGORY, BOTTOMS_SUB_CATEGORY, PANTS_SUB_CATEGORY);
        ProductPage productPage = indexPage.selectRandomProduct();
        String itemName = productPage.getItemName();
        WishListPage wishListPage = productPage.addProductToWishList();

        assertAll(
                () -> assertTrue(wishListPage.isDisplayed(), "WishList is not loaded"),
                () -> assertEquals(itemName, wishListPage.getItemName(), "Item does not match the selected")
        );
    }
}
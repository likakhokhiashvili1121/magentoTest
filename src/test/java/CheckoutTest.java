import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.CustomerAddress;

/*


public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutProcess() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();

        homePage.getHeader().chooseCategoryMenu("Dresses", "Casual Dresses");
        IndexPage indexPage = new IndexPage(driver);
        ProductPage productPage = indexPage.selectRandomProduct();
        productPage.addProductToCart();

        CartPage cartPage = homePage.getHeader().clickCartButton();
        Assert.assertTrue(cartPage.isDisplayed(), "Cart Page is not displayed.");

        CheckoutPage checkoutPage = cartPage.proceedToCheckout();
        Assert.assertTrue(checkoutPage.isDisplayed(), "Checkout Page is not displayed.");

        CustomerAddress customerAddress = new CustomerAddress("1234567890", "varketilidzma", "Tbilis", "12345", "Georgia");
        checkoutPage.fillShippingInformation(customerAddress);

        checkoutPage.chooseShippingMethod("Standard Shipping");
        Assert.assertTrue(checkoutPage.isShippingMethodSelected("Standard Shipping"), "Shipping method not selected.");

        PaymentPage paymentPage = checkoutPage.proceedToPayment();
        Assert.assertTrue(paymentPage.isDisplayed(), "Payment Page is not displayed.");

        paymentPage.selectPaymentMethod("Credit Card");
        paymentPage.enterCreditCardDetails("1234 5678 9012 3456", "12/24", "123");

        OrderConfirmationPage confirmationPage = paymentPage.completePayment();
        Assert.assertTrue(confirmationPage.isOrderPlaced(), "Order confirmation message not found.");

    }
}


 */
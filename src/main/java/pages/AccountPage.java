package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//a[text()='Address Book']")
    private WebElement addressBookButton;

    @FindBy(xpath = "//div[@class='box box-information']")
    private WebElement accountInfoBox;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        waitForElementLocated(accountInfoBox);
        return isDisplayed(accountInfoBox);
    }

    public AddressBookPage navigateToAddressBookPage() {
        addressBookButton.click();
        return new AddressBookPage(driver);
    }
}
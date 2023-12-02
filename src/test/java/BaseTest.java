import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utils.DriverFactory;

public class BaseTest {

    protected HomePage homePage;
    protected static WebDriver driver;

    public BaseTest() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
    }

    @AfterAll
    public static void closeBrowser() {
        DriverFactory.quitDriver();
    }

    @BeforeEach
    public void startBrowser() {
        homePage.navigateTo();
    }
}
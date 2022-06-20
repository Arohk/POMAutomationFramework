package pomscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginModal;
import pages.SignUpModal;
import utils.Screenshot;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;
    SignUpModal signUpModal;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(600));
        defaultPage = new DefaultPage(driver);
        loginModal = new LoginModal(driver);
        homePage = new HomePage(driver);
        signUpModal = new SignUpModal(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            Screenshot.capture(driver, "screenshots", result.getName());
        }
        driver.quit();
    }

}

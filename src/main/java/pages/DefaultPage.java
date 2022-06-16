package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The page that is open after the URL is hit.
 */
public class DefaultPage {

    WebDriver driver;

    // constructor
    public DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    @FindBy(id = "nav-link-login")
    WebElement signInButton;


    // Methods
    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The page that is open after the URL is hit.
 */
public class DefaultPage extends BasePage{

    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    @FindBy(id = "nav-link-login")
    WebElement signInButton;


    // Interaction Methods
    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    // Assertions Methods

}

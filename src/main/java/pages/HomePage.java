package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The page that the user is after he has been logged in.
 */
public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators using PageFactory
    @FindBy(id = "nav-link-new-post")
    WebElement newPostButton;

    @FindBy(xpath = "//*[contains(@class,'sign-out')]")
    WebElement logoutButton;

    // Interaction Methods

    // boolean methods used in TestNG test assertions
    public boolean isNewPostButtonDisplayed() {
        return newPostButton.isDisplayed();
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

}

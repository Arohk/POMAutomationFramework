package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The modal that opens after the user clicks the login button.
 * The Page Factory is not used in this page.
 */
public class LoginModal {
    WebDriver driver;

    public LoginModal(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By userNameField = By.id("defaultLoginFormUsername");
    By passwordField = By.id("defaultLoginFormPassword");
    By signInButton = By.id("sign-in-button");

    // Methods
    public void enterUsername(String username){
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }


}

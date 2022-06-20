package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The modal that opens after the user clicks the login button.
 * The Page Factory is not used in this page.
 */
public class LoginModal extends BasePage{

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    // Locators
    By userNameField = By.id("defaultLoginFormUsername");
    By passwordField = By.id("defaultLoginFormPassword");
    By signInButton = By.id("sign-in-button");
//    By registerButton = By.id("//a[text()='Register']");
    By registerButton = By.linkText("Register");

    // Interaction Methods
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

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

}

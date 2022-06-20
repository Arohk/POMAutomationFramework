package pomscripts;
import org.testng.Assert;
import org.testng.annotations.*;
public class SmokeTests extends BaseTest {

    @Test(retryAnalyzer = utils.Retry.class)
    public void loginTest() {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test51");
        loginModal.enterPassword("test51");
        loginModal.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
        Assert.assertTrue(homePage.isLogoutButtonDisplayed());
    }

    @Test(retryAnalyzer = utils.Retry.class)
    public void createAccount() {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.clickRegisterButton();
        signUpModal.registerUser("testDynamic", "testDynamic");
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
    }

    @Test
    public void likePost() {
        loginTest();
        //TODO like post test logic after login
        logoutTest();
    }

    @Test
    public void logoutTest() {
        //TODO implement logout functionality from every place
        // click the home button
        // click the logout button
    }


}

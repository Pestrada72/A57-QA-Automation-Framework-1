import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static java.sql.DriverManager.getDriver;

public class LoginTests extends BaseTest {

    @Test
    public void loginValidEmailValidPasswordTest() {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickSubmit();
        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }

    @Test
    public void loginValidEmailPasswordUsingPOM() {
       LoginPage loginPage = new LoginPage(getThreadLocal());
       HomePage homePage = new HomePage(getThreadLocal());

       loginPage.provideEmail("pearl.estrada@testpro.io");
       loginPage.providePassword("April969!!");
       loginPage.clickSubmit();

       Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }
    @Test
    public void loginValidEmailPasswordUsingPageFactory() {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmailToLogin("pearl.estrada@testpro.io");
        loginPage.providePasswordToLogin("April969!!");
        loginPage.clickLoginBtn();

        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }

}
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void loginValidEmailPassword() {
        provideEmail("pearl.estrada@testpro.io");
        providePassword("April969!!");
        clickLoginBtn();
        WebElement avatarIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='avatar']")));
        Assert.assertTrue(avatarIcon.isDisplayed());
    }

    @Test
    public void loginInvalidEmailValidPassword() {
        navigateToPage();
        provideEmail("email@test.com");
        providePassword("April969!!");
        clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void loginValidEmailEmptyPassword() {
        navigateToPage();
        provideEmail("pearl.estrada@testpro.io");
        providePassword(" ");
        clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test(dataProvider = "NegativeLoginTestData", dataProviderClass = TestDataProvider.class)
    public void negativeLoginTest(String email, String password) {
        provideEmail(email);
        providePassword(password);
        clickLoginBtn();
        String expectedUrl = "//https://qa.koel.app/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        System.out.println("Just Testing Console");
    }

    @Test
    public void loginValidEmailValidPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickSubmit();
        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }

    @Test
    public void loginValidEmailPasswordUsingPOM() {
       LoginPage loginPage = new LoginPage(driver);
       HomePage homePage = new HomePage(driver);
       AllSongsPage allSongsPage = new AllSongsPage(driver);

       loginPage.provideEmail("pearl.estrada@testpro.io");
       loginPage.providePassword("April969!!");
       loginPage.clickSubmit();

       Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }
    @Test
    public void loginValidEmailPasswordUsingPageFactory() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmailToLogin("pearl.estrada@testpro.io");
        loginPage.providePasswordToLogin("April969!!");
        loginPage.clickLoginBtn();

        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }

}
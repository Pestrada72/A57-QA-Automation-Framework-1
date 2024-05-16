import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginValidEmailValidPassword() {
        //NavigateToLoginPage();
        provideEmail("pearl.estrada@testpro.io");
        providePassword("April969!!");
        clickLoginBtn();
        WebElement avatarIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[class='avatar']")));
        Assert.assertTrue(avatarIcon.isDisplayed());
    }

    @Test
    public void LoginInvalidEmailValidPassword () {
        //NavigateToLoginPage();
        provideEmail("invalidemail@test.com");
        providePassword("April969!!");
        clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void loginValidEmailEmptyPassword() {
        //NavigateToLoginPage();
        provideEmail("pearl.estrada@testpro.io");
        providePassword("");
        clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {
    super(givenDriver);
    }

    //WebElements
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By clickSubmit = By.cssSelector("button[type='submit']");

    //Helper Methods
    public void provideEmail(String email) {
        findElement(emailField).clear();
        findElement(emailField).sendKeys(email);
    }

    public void providePassword(String password) {
        findElement(passwordField).clear();
        findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        findElement(clickSubmit).click();
    }

    public void login() {
        provideEmail("pearl.estrada@testpro.io");
        providePassword("April969!!");
        clickSubmit();
    }
}

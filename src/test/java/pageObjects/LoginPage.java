package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By loginBtn = By.cssSelector("button[type='submit']");

    //______________//
    // PAGE Factory //
    //______________//

    @FindBy(css = "input[type='email']")
    WebElement emailFieldLocator;

    @FindBy(css = "input[type='password']")
    WebElement passwordFieldLocator;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtnLocator;


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
        findElement(loginBtn).click();
    }

    public void login() {
        provideEmail("pearl.estrada@testpro.io");
        providePassword("April969!!");
        clickSubmit();
    }
    //Methods using Page Factory Elements
    public void clickLoginBtn() {
        loginBtnLocator.click();

    }

    public void provideEmailToLogin(String email) {
        emailFieldLocator.clear();
        emailFieldLocator.sendKeys(email);

    }

    public void providePasswordToLogin(String password) {
        passwordFieldLocator.clear();
        passwordFieldLocator.sendKeys(password);

    }
}

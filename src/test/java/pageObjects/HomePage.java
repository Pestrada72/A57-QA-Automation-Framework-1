package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    protected By userAvatarIcon = By.cssSelector("img.avatar");

    //Helper Methods
    private WebElement getUserAvatar() {
        return findElement(userAvatarIcon);
    }
}

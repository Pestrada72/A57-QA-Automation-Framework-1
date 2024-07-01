package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FavoritesPage extends BasePage {
    public FavoritesPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    By selectFirstFavoriteSong = By.cssSelector("li:nth-child(1) button.text-secondary");
    By selectSecondFavoriteSong = By.cssSelector("li:nth-child(2) button.text-secondary");
    By navToFavoritePage = By.cssSelector("li.playlist.favorites");
    By deleteFavoriteSong = By.xpath("//*[@id=\"favoritesWrapper\"]/div/div/div[1]/table/tr[1]/td[6]/button/i");


    //Methods for Locator
    public void selectFirstFavoriteSong() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectFirstFavoriteSong));
        findElement(selectFirstFavoriteSong).click();
    }

    public void selectSecondFavoriteSong() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectSecondFavoriteSong));
        findElement(selectSecondFavoriteSong).click();
    }

    public void navToFavoritePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(navToFavoritePage));
        findElement(navToFavoritePage).click();
    }

    public void deleteFavoriteSong() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteFavoriteSong));
        findElement(deleteFavoriteSong).click();
    }

}

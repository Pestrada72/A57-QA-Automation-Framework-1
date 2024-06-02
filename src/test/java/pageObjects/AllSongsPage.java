package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllSongsPage extends BasePage {

    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    By chooseAllSongsList = By.cssSelector("li a.songs");
    By contextClickFirstSong = By.cssSelector(".all-songs tr.song-item:nth-child(1)");
    By choosePlayOption = By.cssSelector("li.playback");
    By soundBarVisualizer = By.cssSelector("[data-testid='sound-bar-play']");
    //Methods using locators

    public void chooseAllSongsList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseAllSongsList));
        findElement(chooseAllSongsList).click();
    }

    public void contextClickFirstSong() {
        WebElement song = wait.until(ExpectedConditions.elementToBeClickable(contextClickFirstSong));
        actions.contextClick(song).perform();
    }

    public void choosePlayOption() {
        findElement(choosePlayOption).click();
    }

    public boolean isPlaying() {
        findElement(soundBarVisualizer).isDisplayed();
        return true;
    }
}

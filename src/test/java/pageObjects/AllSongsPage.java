package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllSongsPage extends BasePage {

    public AllSongsPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    private By chooseAllSongsList = By.cssSelector("li a.songs");
    private By contextClickFirstSong = By.cssSelector(".all-songs tr.song-item:nth-child(1)");
    private By choosePlayOption = By.cssSelector("li.playback");
    private By soundBarVisualizer = By.cssSelector("[data-testid='sound-bar-play']");
    //Methods using locators

    public void chooseAllSongsList() {
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

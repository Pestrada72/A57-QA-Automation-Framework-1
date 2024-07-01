package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PlaylistPage extends BasePage {

    public PlaylistPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    //Locators
    By createNewPlaylist = By.cssSelector("i.fa.fa-plus-circle.create");
    By clickNewPlaylist = By.cssSelector("[data-testid='playlist-context-menu-create-simple']");
    By enterNewPlaylistName = By.cssSelector("input[name='name']");
    By newPlaylistDisplayed = By.cssSelector("section[id='playlists']");

    //Methods Using Locators
    public void createNewPlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createNewPlaylist));
        findElement(createNewPlaylist).click();
    }

    public void clickNewPlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickNewPlaylist));
        findElement(clickNewPlaylist).click();
    }

    public void enterNewPlaylistName() {
        driver.findElement(enterNewPlaylistName).sendKeys("playlistName");
    }

    public boolean newPlaylistDisplayed() {
        return driver.findElement(newPlaylistDisplayed).isDisplayed();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {
    @Test
    public void playSong() throws InterruptedException {
        //Login
        provideEmail("pearl.estrada@testpro.io");
        providePassword("April969!!");
        clickLoginBtn();
        //Choose all songs List
        chooseAllSongsList();
        //Right click first song
        contextClickFirstSong();
        //Choose play option
        choosePlayOption();
        //check to see if song is playing
        Assert.assertTrue(isPlaying());
    }

    public void chooseAllSongsList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li a.songs"))).click();
    }

    public void contextClickFirstSong() throws InterruptedException {
        WebElement firstSongElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".all-songs tr.song-item:nth-child(1)")));
        actions.contextClick(firstSongElement).perform();
    }

    public void choosePlayOption() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.playback"))).click();
    }
    public boolean isPlaying() {
    WebElement soundBarVisualizer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='sound-bar-play']")));
    return soundBarVisualizer.isDisplayed();
    }
}

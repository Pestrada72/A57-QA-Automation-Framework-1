import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongsPage;
import pageObjects.LoginPage;

public class Homework24 extends BaseTest {

    @Test
    public void playSong() {

        LoginPage loginPage = new LoginPage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickLoginBtn();
        allSongsPage.chooseAllSongsList();
        allSongsPage.contextClickFirstSong();
        allSongsPage.choosePlayOption();
        Assert.assertTrue(allSongsPage.isPlaying());
    }
}


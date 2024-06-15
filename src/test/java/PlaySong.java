import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongsPage;
import pageObjects.LoginPage;

public class PlaySong extends BaseTest {

    @Test
    public void playSong() {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        AllSongsPage allSongsPage = new AllSongsPage(getThreadLocal());
        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickSubmit();
        allSongsPage.chooseAllSongsList();
        allSongsPage.contextClickFirstSong();
        allSongsPage.choosePlayOption();
        allSongsPage.isPlaying();
        Assert.assertTrue(allSongsPage.isPlaying());
    }
}


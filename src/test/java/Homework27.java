import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongsPage;
import pageObjects.LoginPage;

public class Homework27 extends BaseTest{

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
        Assert.assertTrue(allSongsPage.isPlaying());
    }
}

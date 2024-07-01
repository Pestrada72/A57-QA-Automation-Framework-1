import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.PlaylistPage;

public class PlaylistTest extends BaseTest {

    @Test
    public void CreatePlaylist() {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        PlaylistPage playlistPage = new PlaylistPage(getThreadLocal());
        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickSubmit();
        playlistPage.createNewPlaylist();
        playlistPage.clickNewPlaylist();
        playlistPage.enterNewPlaylistName();
        playlistPage.newPlaylistDisplayed();
        Assert.assertTrue(playlistPage.newPlaylistDisplayed());
    }
}

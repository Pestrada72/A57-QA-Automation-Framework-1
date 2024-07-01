import org.testng.annotations.Test;
import pageObjects.FavoritesPage;
import pageObjects.LoginPage;

public class FavoritesTest extends BaseTest {

    @Test
    public void FavoritesTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        FavoritesPage favoritesPage = new FavoritesPage(getThreadLocal());
        loginPage.provideEmail("pearl.estrada@testpro.io");
        loginPage.providePassword("April969!!");
        loginPage.clickSubmit();
        favoritesPage.selectFirstFavoriteSong();
        favoritesPage.selectSecondFavoriteSong();
        favoritesPage.navToFavoritePage();
        favoritesPage.deleteFavoriteSong();

    }
}

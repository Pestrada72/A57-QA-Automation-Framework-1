package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AllSongsPage;

import java.time.Duration;

public class PlaySongStepDefinitions {
    WebDriver driver;
    WebDriverWait wait;
    AllSongsPage allSongsPage;

    @Given("I am logged in")
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        allSongsPage = new AllSongsPage(driver);
    }

    @When("I choose all songs list")
    public void chooseAllSongsList() {
        //driver.findElement(By.xpath("//button[text()='All Songs']")).click();
        AllSongsPage allSongsPage = new AllSongsPage(driver);
        allSongsPage.chooseAllSongsList();
    }

    @And("I choose first song")
    public void contextClickFirstSong() {
        AllSongsPage allSongsPage = new AllSongsPage(driver);
        allSongsPage.contextClickFirstSong();
    }

    @And("I choose play option")
        public void choosePlayOption() {
        allSongsPage.choosePlayOption();
    }

    @Then("Verify song is playing")
        public boolean verifySongPlaying() {
        return allSongsPage.isPlaying();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}



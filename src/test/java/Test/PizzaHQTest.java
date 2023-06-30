package Test;

import Models.LoginPage;
import Models.FoodPage;
import Models.ProfilePage;
import Models.Toolbar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PizzaHQTest {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = getWebDriver();
        driver.get("https://d3ovkzfkbrwp1z.cloudfront.net/#/");
        driver.manage().window().maximize();
    }

    // rename this test
    @Test
    public void formTest() {
        Toolbar tool = new Toolbar(driver);
        tool.clickLoginIcon();

        LoginPage form = new LoginPage(driver);
        form.enterName("bob");
        form.enterPassword("ilovepizza");
        form.clickLoginBtn();

        tool.clickProfileBtn();

        ProfilePage profile = new ProfilePage(driver);

        Assertions.assertEquals("\nWelcome bob", profile.getWelcomeText());

        tool.clickProfileBtn();

        new WebDriverWait(driver, Duration.ofSeconds(5));

        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void foodTest() {
        Toolbar tool = new Toolbar(driver);
        FoodPage food = new FoodPage(driver);

        tool.clickMenuBtn();
        food.getAllFoods();

        food.getFood("Margherita").clickOrderBtn();

    }

    @AfterEach
    public void afterAll() {
        driver.quit();
    }

    private WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allows-origin=*");
        driver = new ChromeDriver(options);
        return driver;
    }
}

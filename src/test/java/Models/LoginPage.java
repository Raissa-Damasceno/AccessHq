package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(By.id("gen-20230630-username")).sendKeys(name);
    }
    public void enterPassword(String password) {
        driver.findElement(By.id("gen-20230630-password")).sendKeys(password);
    }
    public void clickLoginBtn() {
        driver.findElement(By.cssSelector("[aria-label=login]")).click();
    }

}

package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Toolbar {

    private WebDriver driver;
    public Toolbar(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginIcon() {
        driver.findElement(By.className("nav-login-signup")).click();
    }

    public void clickProfileBtn(){
        driver.findElement(By.className("nav-profile")).click();
    }

    public void clickLogout() {
        clickProfileBtn();
    }

    public void clickMenuBtn() {
        driver.findElement(By.cssSelector("[aria-label=menu]")).click();
    }




}

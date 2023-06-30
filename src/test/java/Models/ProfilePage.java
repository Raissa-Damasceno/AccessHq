package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeText() {
        return driver.findElement(By.tagName("h2")).getText().replace("person", "");
    }

}

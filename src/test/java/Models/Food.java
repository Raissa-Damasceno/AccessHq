package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Food {
    private WebElement pizzaElement;
    public Food(WebElement pizzaElement) {
        this.pizzaElement = pizzaElement;
    }

    public String getText() {

        return pizzaElement.findElement(By.className("name")).getText();
    }

    public void clickOrderBtn() {
        pizzaElement.findElement(By.cssSelector("type=button")).click();
        pizzaElement.findElement(By.cssSelector("type=button")).click();
    }


}

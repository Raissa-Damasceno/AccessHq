package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FoodPage {

    private WebDriver driver;

    public FoodPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<Food> getAllFoods() {
        List<Food> foods = new ArrayList<>();

        for(WebElement el : driver.findElements(By.cssSelector("menuItem"))){
            foods.add(new Food(el));
        }

        return foods;
    }

    public Food getFood(String foodStr){
        for(Food food : getAllFoods()) {
            if(food.getText().equalsIgnoreCase(foodStr)) {
                return food;
            }

        }
        throw new NotFoundException("Food not founded");
    }
}

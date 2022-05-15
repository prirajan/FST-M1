import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");

        //Chosen option
        //WebElement chosen = driver.findElement(By.id("single-select"));

        //Find multiList
        Select singleselect = new Select(driver.findElement(By.id("single-select")));

        singleselect.selectByVisibleText("Option 2");

        singleselect.selectByIndex(2);

        singleselect.selectByValue("Option 3");


        driver.quit();














    }

}

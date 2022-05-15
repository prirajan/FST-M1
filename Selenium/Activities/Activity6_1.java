import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-controls");
                //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);
        //Find element of remove checkbox button
        WebElement togglecheckbutton= driver.findElement(By.xpath("//button[@id = 'toggleCheckbox']"));
        //click remove checkbox
        togglecheckbutton.click();

        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        //Click Add /remove checkbox
        togglecheckbutton.click();
        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        //Click checkbox
        checkbox.click();
        driver.close();














    }

}

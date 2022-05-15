import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity6_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");

        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Click change content button on the page
        driver.findElement(By.xpath("//button[contains(@class,'violet')]")).click();

        //Wait for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));

        //getText() and print it "HELLO!"
        String  ajaxText = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(ajaxText);

        //Wait for late text

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));

        //Get late text and print it
        String latetext = driver.findElement(By.id("ajax-content")).getText();

        System.out.println(latetext);

        driver.close();














    }

}

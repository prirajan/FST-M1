import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class Activity11_4 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        //get page title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Get parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window:" + parentWindow);
        //Find link to open new tab and click it
        driver.findElement(By.linkText("Click Me!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


        //Get Window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles" + allWindowHandles);

        //Loop through each handle

        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
            //Print the handle of the current window

            System.out.println("Current window handle: " + driver.getWindowHandle());
            //Wait for page to load completely
            wait.until(ExpectedConditions.titleIs("Newtab"));
            //Print New Tab Title
            System.out.println("New Tab Title is: " + driver.getTitle());

            //Get heading on new page

            String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
            System.out.println("New tab heading is: " + newTabText);

        //Open Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        //Loop through the handles set till we get to the newest handle

        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);

        }


        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());

        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
        //Get heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);


        driver.close();


    }

}

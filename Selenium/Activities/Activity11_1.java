import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


public class Activity11_1 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);
        //click button simple
        driver.findElement(By.id("simple")).click();
        //switch to alert window
        Alert SimpleAlert = driver.switchTo().alert();
        //pint alert text
         System.out.println(SimpleAlert.getText());
        //close the alert
        SimpleAlert.accept();
        driver.close();








    }

}

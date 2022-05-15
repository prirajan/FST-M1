package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {

       WebDriver driver;
       Actions builder;

        @BeforeClass
        public void beforeClass() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            //Open browser
            Reporter.log("Opening browser");
            driver.get("http://alchemy.hguy.co/crm");
        }

        @Test
        public void loginTest() {
            // login to CRM site by providing credential
            Reporter.log("login to CRM site by providing credential");
            WebElement username= driver.findElement(By.xpath("//input[@id='user_name']"));
            username.sendKeys("admin");
            WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
            password.sendKeys("pa$$w0rd");

            Reporter.log("Click login button");
            driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

            WebElement menu = driver.findElement(By.xpath("//a[text()='Activities']"));
            builder = new Actions(driver);
            builder.moveToElement(menu);
            builder.click().build().perform();



        }

        @AfterClass
        public void aterClass()
        {

            //Close the browser
            driver.quit();
        }






}

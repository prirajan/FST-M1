package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

       WebDriver driver;

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
            //String getURL= (driver.getCurrentUrl());
            WebElement Toolbar= driver.findElement(By.xpath("//div[@id = 'toolbar']"));
            String getCssvaluecolor = Toolbar.getAttribute("color");
            System.out.println(getCssvaluecolor);


        }


        @AfterClass
        public void aterClass()
        {

                //Close the browser
               // driver.quit();
        }






}

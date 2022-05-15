package CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {

       WebDriver driver;

        @BeforeClass
        public void beforeClass() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            //Open browser
            driver.get("http://alchemy.hguy.co/crm");
        }

        @Test
        public void getCopyRightText() {
            // Get copyright text
            WebElement Text = driver.findElement(By.xpath("//a[@id='admin_options']"));
            System.out.println("FirstCopyRight Text is : "+ Text.getText());

        }


        @AfterClass
        public void aterClass()
        {
            //Close the browser
                driver.quit();
        }






}

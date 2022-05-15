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

import java.util.List;

public class Activity8 {

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

        @Test(priority = 0)
        public void loginTest(){
            // login to CRM site by providing credential
            Reporter.log("login to CRM site by providing credential");
            WebElement username = driver.findElement(By.xpath("//input[@id='user_name']"));
            username.sendKeys("admin");
            WebElement password = driver.findElement(By.xpath("//input[@id='username_password']"));
            password.sendKeys("pa$$w0rd");

            Reporter.log("Click login button");
            driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

        }
        @Test(priority = 1)
        public void GetTableValues() throws InterruptedException {
           Reporter.log("select submenu leads from sales menu");
            WebElement menu = driver.findElement(By.xpath("//a[text()='Sales']"));
            WebElement submenu = driver.findElement(By.xpath("//*[@id='moduleTab_9_Accounts']"));
            //mouse over sales and then leads
            builder = new Actions(driver);
            builder.moveToElement(menu);
            builder.moveToElement(submenu);
            builder.click(submenu).build().perform();
            Thread.sleep(5000);

            for (int i=1;i<11;i+=2) {
                String xpath1 = "//table/tbody/tr[";
                String xpath2 = "]/td[3]/b/a";
                String XpathVariable = xpath1 + i + xpath2;
                WebElement Table1 = driver.findElement(By.xpath(XpathVariable));
                // System.out.println(XpathVariable);
                System.out.println(Table1.getText());
            }
        }


        @AfterClass
        public void aterClass()
        {

            //Close the browser
            driver.quit();
        }


}

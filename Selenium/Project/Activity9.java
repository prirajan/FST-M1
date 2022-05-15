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

public class Activity9 {

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
            WebElement submenu = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
            //mouse over sales and then Accounts
            builder = new Actions(driver);
            builder.moveToElement(menu);
            builder.moveToElement(submenu);
            builder.click(submenu).build().perform();
            Thread.sleep(5000);
            Reporter.log("get first 10 rows from name and user column");
            for (int i = 1; i < 11; i++) {
                String xpath1 = "//table/tbody/tr[";
                String xpath2 = "]/td[3]/b/a";
                String XpathVariable1 = xpath1 + i + xpath2;
                xpath1 = "//table/tbody/tr[";
                xpath2 = "]/td[8]/a";
                String XpathVariable2 = xpath1 + i + xpath2;
                WebElement Table1 = driver.findElement(By.xpath(XpathVariable1));
                WebElement Table2 = driver.findElement(By.xpath(XpathVariable2));
                System.out.println("Name:  " + Table1.getText() + "  User: " + Table2.getText());
            }

        }


        @AfterClass
        public void aterClass()
        {

            //Close the browser
            driver.quit();
        }


}

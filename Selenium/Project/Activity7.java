package CRM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Wait;

public class Activity7 {

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
        public void loginTest() throws InterruptedException {
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
        public void ClickLeadssmenu() throws InterruptedException {
           Reporter.log("select submenu leads from sales menu");
            WebElement menu = driver.findElement(By.xpath("//a[text()='Sales']"));
            WebElement submenu = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
            //mouse over sales and then leads
            builder = new Actions(driver);
            builder.moveToElement(menu);
            builder.moveToElement(submenu);
            builder.click(submenu).build().perform();
            Thread.sleep(5000);
        }

    @Test(priority = 2)
    public void GetPhNo() throws InterruptedException {
        Reporter.log("click additional information icon and get ph no");
        WebElement Addicon = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[10]"));
        Addicon.click();
        Thread.sleep(2000);
        String phone = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")).getText();
        System.out.println(phone);

    }

        @AfterClass
        public void aterClass()
        {

            //Close the browser
            driver.quit();
        }






}

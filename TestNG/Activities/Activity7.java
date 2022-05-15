package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {
        WebDriver driver;

        @BeforeClass
        public void beforeClassMethod() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            //Open browser
            driver.get("https://www.training-support.net/selenium/login-form");
        }

        @DataProvider(name="Authentication")
        public static Object[][] credentials()
        {
            return new Object[][]
                    {
                            {"admin","password"}
                    };


        }


        @Test(dataProvider="Authentication")
        public void logintest(String username, String password)
        {
            WebElement usernameF = driver.findElement(By.id("username"));
            usernameF.sendKeys(username);
            WebElement passwordF = driver.findElement(By.id("password"));
            passwordF.sendKeys(password);

            //click login button
            driver.findElement(By.xpath("//button[text()='Log in']")).click();
            //Read login message
            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            Assert.assertEquals("Welcome Back, admin", loginMessage);

             }

        @AfterClass
        public void AfterClassMethod() {
            driver.close();

        }

}

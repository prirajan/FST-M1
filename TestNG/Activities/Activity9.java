package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9 {
        WebDriver driver;


        @BeforeTest
        public void beforeTestMethod() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            Reporter.log("starting test");
            //Open browser

            driver.get("https://www.training-support.net/selenium/javascript-alerts");
            Reporter.log("Browser opened");

                // Check the title of the page
                String title = driver.getTitle();
                //Print the title of the page
                System.out.println("Page title is: " + title);
        }


        @BeforeMethod
        public void beforeMethod()
        {
            Reporter.log("testcase setup started");
            driver.switchTo().defaultContent();
        }


        @Test(priority = 0)
        public void simpleAlertTestCase() {
            Reporter.log("simpleAlertTestCase() started");
            driver.findElement(By.id("simple")).click();
            Reporter.log("Simple Alert opened |");
            //Switch to alert window
            Alert simpleAlert = driver.switchTo().alert();
            Reporter.log("Switched focus to alert |");
            //Get test from the alert

            String alertText = simpleAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");

            //Assertion
            Assert.assertEquals("This is a JavaScript Alert!", alertText);
            simpleAlert.accept();
            Reporter.log("Alert closed");
            Reporter.log("Test case ended |");

        }


        @Test(priority = 1)
        public void confirmAlertTestCase() {
            Reporter.log("confirmAlertTestCase() started |");
            //Click the button to open a simple alert
            driver.findElement(By.id("confirm")).click();
            Reporter.log("Confirm Alert opened |");

            //Switch to alert window
            Alert confirmAlert = driver.switchTo().alert();
            Reporter.log("Switched focus to alert |");

            //Get text in the alert box and print it
            String alertText = confirmAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");

            //Assertion
            Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

            confirmAlert.accept();
            Reporter.log("Alert closed |");

            Reporter.log("Test case ended |");

        }
        @Test(priority = 2)
        public void promptAlertTestCase() {
            Reporter.log("promptAlertTestCase() started |");
            //Click the button to open a simple alert
            driver.findElement(By.id("prompt")).click();
            Reporter.log("Prompt Alert opened |");

            //Switch to alert window
            Alert promptAlert = driver.switchTo().alert();
            Reporter.log("Switched foucs to alert |");

            //Get text in the alert box and print it
            String alertText = promptAlert.getText();
            Reporter.log("Alert text is: " + alertText + " |");

            promptAlert.sendKeys("Awesome!");
            Reporter.log("Text entered in prompt alert |");

            //Assertion
            Assert.assertEquals("This is a JavaScript Prompt!", alertText);

            promptAlert.accept();
            Reporter.log("Alert closed |");

            Reporter.log("Test case ended |");
        }


        @AfterTest
        public void afterTestMethod() {
            //Close the browser
            Reporter.log("Ending Test |");
            driver.close();
           // driver.quit();


    }

}

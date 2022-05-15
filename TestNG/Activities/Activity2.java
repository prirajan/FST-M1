package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {
        WebDriver driver;

        @BeforeClass
        public void beforeClassMethod() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();

            //Open browser
            driver.get("https://www.training-support.net/selenium/target-practice");
        }

        @Test
        public void Test1() {
            // Check the title of the page
            String title = driver.getTitle();
            //Print the title of the page
            System.out.println("Page title is: " + title);
            //Assertion for page title
            Assert.assertEquals(title,"Target Practice");

        }

        @Test
        public void Test2() {

            WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
            Assert.assertTrue(blackbutton.isDisplayed());
            Assert.assertEquals(blackbutton.getText(),"black");

        }

        @Test(enabled = false)
        public void Test3() {

            String subheading = driver.findElement(By.className("sub")).getText();
            Assert.assertTrue(subheading.contains("Practice"));

        }


        @Test
        public void Test4() {

            //This test will be skipped and will be shown as skipped

            throw new SkipException("Skipping test case");

        }

        @AfterClass
        public void AfterClassMethod() {

                //Close the browser
               driver.close();

        }

}

package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
        WebDriver driver;

        @BeforeClass
        public void beforeClassMethod() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            //Open browser
            driver.get("https://www.training-support.net/selenium/target-practice");
        }


        @Test (groups = {"HeaderTests", "ButtonTests"})
        public void pageTitleTest() {
            // Check the title of the page
            String title = driver.getTitle();

            //Print the title of the page
            System.out.println("Page title is: " + title);

            //Assertion for page title
            Assert.assertEquals("Target Practice", title);
              }


        @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
        public void HeaderTest1() {
                WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
                Assert.assertEquals(header3.getText(), "Third header");
            }



        @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
        public void HeaderTest2() {
                WebElement header5 = driver.findElement(By.cssSelector("h5.ui"));
                Assert.assertEquals(header5.getCssValue("color"), "rgb(33, 186, 69)");

        }


        @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
        public void ButtonTest1() {
            WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
            Assert.assertEquals(button1.getText(), "Olive");

         }


        @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
        public void ButtonTest2() {
            WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
            Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");

    }


        @AfterClass
        public void AfterClassMethod() {
            //driver.close();

        }

}

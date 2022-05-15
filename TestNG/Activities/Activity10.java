package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity10 {
        WebDriver driver;
        Actions builder ;


        @BeforeTest
        public void beforeTestMethod() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            Reporter.log("starting test");
            //Open browser

            driver.get("https://www.training-support.net/selenium/sliders");
            Reporter.log("Browser opened");

        }


            @Test(enabled = false)
            public void sliderToMiddleTest()
            {
                //Find slider
                WebElement slider = driver.findElement(By.id("slider"));
                //Clicking on the slider element moves it to the middle
                slider.click();
                String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
                Reporter.log("Mid value: " + volumeLevel);
                Assert.assertEquals(volumeLevel, "50");

            }


            @Test
            public void sliderToMaxTest()
            {
                //Find slider
                WebElement slider = driver.findElement(By.id("slider"));
                //Drag the slider
                slider.click();
                builder.clickAndHold(slider).moveByOffset(75,0).release().build().perform();
                String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
                Reporter.log("Maxvalue: " + volumeLevel);
                Assert.assertEquals(volumeLevel, "100");

            }


            @AfterTest
            public void afterTestMethod() {
                //Close the browser
                Reporter.log("Ending Test |");
                driver.close();
            }
               // driver.quit();


    }



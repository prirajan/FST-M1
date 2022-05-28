package Activities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity2 {

        WebDriverWait wait;
        AndroidDriver<MobileElement> driver = null;

        @BeforeClass
        public void setup() throws MalformedURLException {
            // Set the Desired Capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("appPackage", "com.android.chrome");
            caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            caps.setCapability("noReset", true);

            // Instantiate Appium Driver
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 30);
        }

        @Test
        public void testSearchAppium() {
            // Open page in browser
            driver.get("https://www.training-support.net/");

            // Wait for page to load
            //wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));
            //driver.findElement(MobileBy.id("about-link"));

            driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[4]");

            // Get heading on page and print it
            String pageTitle = driver
                    .findElementByXPath("//android.view.View[@text='Training Support']")
                    .getText();
            System.out.println("Title on Homepage: " + pageTitle);

            // Find About Us button and click it
            MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@content-desc='About Us']");
            aboutButton.click();

            // Wait for new page to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    MobileBy.xpath("//android.widget.TextView[@text='About Us']")
            ));

            // Get heading on About Us page and print it
            String newPageTitle = driver
                    .findElementByXPath("//android.widget.TextView[@text='About Us']")
                    .getText();
            System.out.println("Title on new page: " + newPageTitle);

            // Assertions
            Assert.assertEquals(pageTitle, "Training Support");
            Assert.assertEquals(newPageTitle, "About Us");
        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }


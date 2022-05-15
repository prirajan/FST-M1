package CRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity2 {

       WebDriver driver;

        @BeforeClass
        public void beforeClass() {
            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            //Open browser
            driver.get("http://alchemy.hguy.co/crm");
        }

        @Test
        public void getsrcofimage() {
            // get src of an image and print
            WebElement image = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
            System.out.println("Src attribute is: "+ image.getAttribute("src"));

        }


        @AfterClass
        public void aterClass()
        {
                //Close the browser
                driver.quit();
        }






}

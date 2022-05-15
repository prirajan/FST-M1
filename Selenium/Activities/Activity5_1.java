import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find the element checkbox
         WebElement checkboxvisibility =driver.findElement(By.xpath("//input[@type ='checkbox']"));
        System.out.println("Is check box displayed? " + checkboxvisibility.isDisplayed());

        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("Is check box displayed? " + checkboxvisibility.isDisplayed());

        driver.quit();














    }

}

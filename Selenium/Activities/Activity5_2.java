import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find the element checkbox and verify the state
         WebElement checkbox =driver.findElement(By.xpath("//input[@type ='checkbox']"));
        System.out.println("Is checkbox selected ? " + checkbox.isSelected());

        checkbox.click();

        System.out.println("Is checkbox Selected? " + checkbox.isSelected());

        driver.quit();














    }

}

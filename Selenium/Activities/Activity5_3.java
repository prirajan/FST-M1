import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find the element textbox and verify the state
         WebElement textbox =driver.findElement(By.xpath("//input[@type ='text']"));
        System.out.println("Is textbox enabled? " + textbox.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Is textbox enabled? " + textbox.isEnabled());


       // driver.quit();














    }

}

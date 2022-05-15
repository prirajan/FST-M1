import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find the element firstname
        WebElement elementfirstName= driver.findElement(By.id("firstName"));
        elementfirstName.sendKeys("Ragul");

        //Find the element lastname
        WebElement elementlastName= driver.findElement(By.id("lastName"));
        elementlastName.sendKeys("Dravid");

        //Find the element email
        WebElement elementemail= driver.findElement(By.id("email"));
        elementemail.sendKeys("Activity3@gmail.com");

        //Find the element number
        WebElement elementnumber= driver.findElement(By.id("number"));
        elementnumber.sendKeys("9234567890");
        Thread.sleep(2000
        );
        driver.findElement(By.cssSelector(".ui.green.button")).click();
                //driver.quit();














    }

}

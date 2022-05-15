import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find element Username and enter value
        WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        username.sendKeys("admin");

        //Find element password and enter value
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        password.sendKeys("password");

        //Find element confirm password
        WebElement confirmpassword = driver.findElement(By.xpath("//label[text()= 'Confirm Password']/following::input"));
        confirmpassword.sendKeys("password");

        WebElement email = driver.findElement(By.xpath("//label[contains(text(),'mail')]/following-sibling::input"));
        email.sendKeys("admin@tmail.com");

        //Find signup button and click
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

        //find login message

        String loginmessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is : " + loginmessage);

        driver.close();














    }

}

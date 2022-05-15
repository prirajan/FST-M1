import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity11_2 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);
        //click button simple
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        //switch to alert window
        Alert ConfirmAlert = driver.switchTo().alert();
        //pint alert text
         System.out.println(ConfirmAlert.getText());
        //close the alert with okay
        ConfirmAlert.accept();
        //click confirm button
        confirm.click();
        //switch to alert
        Alert ConfirmAlert1 = driver.switchTo().alert();
        //cancel the alert
        ConfirmAlert1.dismiss();
        driver.close();








    }

}

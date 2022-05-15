import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity10_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Find the cube
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //left click
        actions.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());

        //double click
        actions.doubleClick(cube).click();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());

        //Righclick

        actions.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("right Click: " + cubeVal.getText());

        //close the browser
        driver.quit();
    }
}














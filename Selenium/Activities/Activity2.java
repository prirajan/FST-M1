import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);
        //Find About us by id()
        WebElement elementid = driver.findElement(By.id("about-link"));
        System.out.println("Text by idlocator is: " + elementid.getText());
        //Find About us by className()
        WebElement elementClassName = driver.findElement(By.className("green"));
        System.out.println("Text by elementClassName is: " + elementClassName.getText());
        //Find About us by linkText()
        WebElement elementLinkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Text by elementLinkText is: " + elementLinkText.getText());
        //Find About us by cssSelector()()
        WebElement elementcssSelector = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text by elementcssSelector is: " + elementcssSelector.getText());

        driver.quit();














    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        //get title
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);
        //Find About us by id()
        driver.findElement(By.xpath("//*[@id='about-link']")).click();
        //Get Newtitle
        String Newtitle = driver.getTitle();
        System.out.println("the title of the page is :" + Newtitle);


        //driver.quit();














    }

}

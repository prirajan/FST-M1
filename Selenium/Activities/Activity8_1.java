import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class Activity8_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        //print number of columns & rows
        System.out.println("Number of colums : "+ columns.size());
        System.out.println("Number of rows : "+ rows.size());
        //get value from third rows
        List<WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));

        for(WebElement cellValue:thirdrow)
        {
            System.out.println("Third row value is "+ cellValue.getText());
        }
        //get 2nd row , 2nd column value
        WebElement secondcolumn = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));

        System.out.println("value in 2,2 is  "+ secondcolumn.getText());

        driver.close();








    }

}

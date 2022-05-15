import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class Activity8_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'sortableTable']/thead/tr/th"));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr"));
        //print number of columns & rows in sortable tbale
        System.out.println("Number of colums : "+ columns.size());
        System.out.println("Number of rows : "+ rows.size());

        //get 2nd row , 2nd column value
        WebElement secondcolumn = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("value in 2,2 is before sorting "+ secondcolumn.getText());

        //sort 2nd column
       driver.findElement(By.xpath("//table[@id = 'sortableTable']/thead/tr/th[2]")).click();


        //get 2nd row , 2nd column value again
        WebElement secondcolumnafter = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("value in 2,2 is before sorting "+ secondcolumnafter.getText());

        WebElement footerrow= driver.findElement(By.xpath("//table[@id = 'sortableTable']/tfoot/tr"));
        System.out.println("footer row value is "+ footerrow.getText());


        driver.quit();













    }

}

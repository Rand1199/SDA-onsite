package Day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.TestBase;

import java.util.List;

public class C01WebTable extends TestBase {

    @Test
    public void test(){
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        // Find the third row of the table
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]"));

        // Get the text of the second column in the third row
        String secondColumnData = thirdRow.findElement(By.xpath("./td[2]")).getText();
        System.out.println("Data in the 2nd column of the 3rd row: " + secondColumnData);

        // Get all the values of a dynamic table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println();
        }
    }



    }



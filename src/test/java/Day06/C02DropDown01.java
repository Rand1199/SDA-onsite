package Day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02DropDown01 {
    /* When working with dropdowns:
   * Locate the <select> element: //select[@id='oldSelectMenu']
   * Create a Select object using the select element:
       Select select = new Select(webElement)
   * Use methods through the select object:
       1- selectByIndex(): index of the option element
       2- selectByValue(): value attribute of the option element
       3- selectByVisibleText(): visible text of the option element

// Methods used for informational purposes in Select elements:
   select.getAllSelectedOptions(); -> Returns all selected values in a multi-select dropdown.
   select.getFirstSelectedOption(); -> Returns the first selected option.
   select.getOptions(); -> Returns all options of the select element in a list.
   select.isMultiple(); -> Returns a boolean indicating whether the select element allows multiple selections.

// Deselection methods:
   1- deselectByIndex() -> Deselects an option by its index.
   2- deselectByValue() -> Deselects an option by its value attribute.
   3- deselectByVisibleText() -> Deselects an option by its visible text (content).
   4- deselectAll() -> Deselects all options.
*/

        static WebDriver driver;

        @BeforeClass
        public static void setUp() {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/select-menu");
        }

        @AfterClass
        public static void tearDown() {
            //driver.quit();
        }

        @Test
        public void dropDownTest() {
            // first locate the webElement
        WebElement element= driver.findElement(By.xpath("//*[text()='Select Option']"));

          //  * Create a Select object using the select element:
         Select select = new Select(element); // to use select method tag name must be 'select'


                //    * Use methods through the select object:
          select.selectByIndex(1);
        }
    }

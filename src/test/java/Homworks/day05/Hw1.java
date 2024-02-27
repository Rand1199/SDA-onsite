package Homworks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Hw1 {
   // Task 1:
   // Go to URL: https://demoqa.com/radio-button
   // Verify whether all 3 options given to the question can be selected.
   // When each option is selected, print the following texts on the console.
     static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        ChromeOptions options =new ChromeOptions();
        driver =new ChromeDriver(options);
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public static void tearDown(){
      //  driver.quit();

    }

    //Verify whether all 3 options given to the question can be selected.

    @Test
    public void radioBTest() {
        List<WebElement> radiob = driver.findElements(By.name("like"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        if (!radiob.get(0).isSelected()) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click()",radiob.get(0));
            radiob.get(0).click();
            System.out.println("radio button 1 is selected...");
        } else {
            System.out.println("radio button 1 is already selected...");

        }
        if (!radiob.get(1).isSelected()) {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click()",radiob.get(1));
            radiob.get(1).click();
            System.out.println("radio 2 is selected...");
        } else {
            System.out.println("radio 2 is already selected...");

            if (!radiob.get(2).isSelected()) {
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click()",radiob.get(2));
                radiob.get(2).click();
                System.out.println("radio 3 is selected...");
            } else {
                System.out.println("radio 3 is already selected...");

            }
            Assert.assertTrue(radiob.get(0).isSelected());
            Assert.assertTrue(radiob.get(1).isSelected());
            Assert.assertTrue(radiob.get(2).isSelected());

        }
        //Verify whether all 3 options given to the question can be selected.
        //When each option is selected, print the following texts on the console.

    //@Test
    //public void test (){


       // WebElement r =driver.findElement(By.id("yesRadio"));
       // JavascriptException js =(JavascriptException)driver
       // js.

        // Verify whether all 3 options given to the question can be selected.
       // List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='like']"));

        // When each option is selected, print the following texts on the console.
       //for (WebElement radioButton : radioButtons) {
       //    // Click on the radio button option
       //    radioButton.click();

       //    // Print the text of the selected radio button option
       //    System.out.println("Selected option: " + radioButton.getText());
       //}
      //  radioButtons.get(0).click();
      //  Assert.assertTrue(radioButtons.get(0).isSelected());
      //  radioButtons.get(1).click();
      //  Assert.assertTrue(radioButtons.get(1).isSelected());
      //  radioButtons.get(2).click();
      //  Assert.assertTrue(radioButtons.get(2).isSelected());


    }
}

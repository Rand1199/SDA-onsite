package Day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;
import java.util.List;

public class C02checkBox {
   // Go to https://the-internet.herokuapp.com/checkboxes
   // Locate the elements of checkboxes.
   // Then click on checkbox 1 if box is not selected.
   // Then click on checkbox 2 if box is not selected.
   // Then verify that checkbox 1 is checked.

     static WebDriver driver ;
    @BeforeClass
    public static void setUp(){


        ChromeOptions options =new ChromeOptions();
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @AfterClass
    public static void tearDown(){
       // driver.quit();

    }

    @Test
    public void checkBotest(){
    List<WebElement> Check = driver.findElements(By.xpath("//*[@type='checkbox']"));
        //Assert.assertTrue(Check.get(1).isSelected());
       if(!Check.get(0).isSelected()){
      Check.get(0).click();
           System.out.println("check box 1 is selected ..");

}else{
           System.out.println("check box 1 is already selected..");
       }
        if(!Check.get(1).isSelected()){
            Check.get(1).click();
            System.out.println("check box 2 is selected ..");

        }else{
            System.out.println("check box 2is already selected..");
        }
        Assert.assertTrue(Check.get(0).isSelected());
        Assert.assertTrue(Check.get(1).isSelected());

    }

}

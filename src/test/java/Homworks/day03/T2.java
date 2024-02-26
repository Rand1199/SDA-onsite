package Homworks.day03;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
      /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the Examples
Click on Locators - Find By Playground Test Page
Print the URL
Navigate back
Print the URL
Click on WebDriver Example Page
Print the URL
Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
And then verify 'two, zero' message is displayed on page
Close driver.
       */

  static WebDriver driver;

     @BeforeClass
    public static void setUp (){
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


     }

@Test
    public void test(){
    driver.get("https://testpages.herokuapp.com/styled/index.html");
   // Click on Locators - Find By Playground Test Page
    driver.findElement(By.partialLinkText("Locators - Find")).click();
   // Print the URL
   String url= driver.getCurrentUrl();
   System.out.println("url = " + url);
    
   // Navigate back
    driver.navigate().back();
    
   // Print the URL
    String url2= driver.getCurrentUrl();
    System.out.println("url2 = " + url2);
   // Click on WebDriver Example Page
    driver.findElement(By.id("webdriverexamplepage")).click();
   // Print the URL
    String url3 =driver.getCurrentUrl();
    System.out.println("url3 = " + url3);
    
   // Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
    driver.findElement(By.xpath("//input[@name]")).sendKeys("20"+ Keys.ENTER);
   // And then verify 'two, zero' message is displayed on page
    boolean mBool = driver.findElement(By.id("message")).isDisplayed();
    Assert.assertTrue(mBool);

}

@AfterClass
    public static void tearDown (){
         driver.quit();

}












}

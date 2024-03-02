package Homworks.day07;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hw2 {

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://the-internet.herokuapp.com/basic_auth");
    }

    @Test
    public void test(){

        // Provide the username and password in the URL
        String username = "admin";
        String password = "admin";
        String baseUrl = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

        // Navigate to the URL with embedded authentication credentials
        driver.get(baseUrl);

        // Perform actions on the authenticated page
        // For example, you can assert page title, verify elements, etc.

        // Enter Username
     //   WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
     //   usernameField.sendKeys("admin");

// Press Tab key to move to the Password field
      //  usernameField.sendKeys(Keys.TAB);

// Enter Password
      //  WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
      //  passwordField.sendKeys("admin");

// Press Enter key to submit the credentials
       // passwordField.sendKeys(Keys.ENTER);
    }
}

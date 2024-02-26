package Homworks.day03;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {

   static WebDriver driver;

@BeforeClass
public static void setUp(){
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://id.heroku.com/login");

}






    @Test
    public void test(){

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email@example.com");





    //Go to https://id.heroku.com/login.
   // Enter an e-mail address.
   // Enter a password.
   // Click on the Login button.
   // There was a problem with your login.
    //If text is visible, print "Registration Failed".
    //If the text is not visible, print "Registered".
   // Close all pages.
}}

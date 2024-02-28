package Homworks.day06;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class challenge3 {
    static WebDriver driver ;
    @BeforeClass
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
    }
    @AfterClass
    public static void tearDown(){
        //   driver.quit();

    }
    @Test
    public void test(){

        Assert.assertEquals("User is directed to create contact page successfully","Contact List App", driver.getTitle());

        Faker faker = new Faker();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("rba.tmimi@gmail.com");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("1234567");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

    }
}

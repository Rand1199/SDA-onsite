package day04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class challenge {
String exurl ="https://automationexercise.com/";
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertNotNull(driver);
         driver.get("https://automationexercise.com/");
       String url = driver.getCurrentUrl();
       Assert.assertEquals(exurl,url);



//click button
        WebElement button = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        button.click();
        Assert.assertEquals("url does not match","https://automationexercise.com/login",driver.getCurrentUrl());

//enter email
        By emailFeild = RelativeLocator.with(By.name("email"));
        driver.findElement(emailFeild).sendKeys("sda@test.com");
//ener password
        By passFeild = RelativeLocator.with(By.name("password"));
        driver.findElement(passFeild).sendKeys("sdainclasstask");
//click button
        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        button1.click();

    }
}

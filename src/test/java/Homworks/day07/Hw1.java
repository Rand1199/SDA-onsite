package Homworks.day07;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hw1 {





    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void test(){

        // Click the first button to trigger an alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert message: " + alertText);

        // Accept the alert (click OK)
        alert.accept();

        // Click the second button to trigger a confirmation alert
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        // Switch to the confirmation alert
        alert = driver.switchTo().alert();

        // Get the text of the confirmation alert and print it
        alertText = alert.getText();
        System.out.println("Confirmation message: " + alertText);

        // Dismiss the confirmation alert (click Cancel)
        alert.dismiss();

        // Click the third button to trigger a prompt alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        // Switch to the prompt alert
        alert = driver.switchTo().alert();

        // Get the text of the prompt alert and print it
        alertText = alert.getText();
        System.out.println("Prompt message: " + alertText);

        // Enter text into the prompt and accept the alert
        alert.sendKeys("Hello, World!");
        alert.accept();
    }
}

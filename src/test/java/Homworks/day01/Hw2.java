package Homworks.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook homepage
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);

        // Verify expected URL equals to the actual URL
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Expected URL matches the actual URL: " + actualUrl);
        } else {
            System.out.println("Expected URL does not match the actual URL.");
        }

        // Verify pagesource of Facebook contains "Facebook"
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source contains 'Facebook'.");
        } else {
            System.out.println("Page source does not contain 'Facebook'.");
        }

        // Close the browser
        driver.quit();
    }
}


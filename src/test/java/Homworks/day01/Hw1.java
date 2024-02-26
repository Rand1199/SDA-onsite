package Homworks.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver\\chromedriver.exe");
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google homepage
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        // Print the title of the page
        System.out.println("Title: " + driver.getTitle());

        // Print the current URL of the page
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Close the browser
        driver.quit();
    }
}

package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavicationCommands {

    public static void main(String[] args) {





    // Creating a WebDriver object
        WebDriver driver =new ChromeDriver();

    // Opening Google website
        driver.get("https://google.com");
    // Opening Clarusway website
        driver.get("https://Clarusway.com");

    // NAVIGATION COMMANDS

    // back() opens the previous page
        System.out.println(driver.getCurrentUrl());
driver.navigate().back();
        System.out.println("driver.getTiTle= "+driver.getTitle());
        // forward() opens the next page after going back
driver.navigate().forward();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // refresh() refreshes the page
driver.navigate().refresh();

    // to() - performs the same function as the get() method
        driver.navigate().to("http://amazon.com");
        driver.quit();
}}

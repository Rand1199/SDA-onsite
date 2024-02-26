package Homworks.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        String expectedTitle = "CHECK24";
        driver.get("https://check24.de");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String titlePage = driver.getTitle();
        Thread.sleep(5000);
        if (titlePage.contains(expectedTitle))
        System.out.println("Passed test");
        else
        System.out.println("Failed test");
        String pageSource = driver.getPageSource();
        driver.close();
        driver.quit();
        System.out.println( pageSource );
    }

}

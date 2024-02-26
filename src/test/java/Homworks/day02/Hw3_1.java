package Homworks.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_1 {
    public static void main(String[] args) throws InterruptedException    {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/");
        driver.navigate().to("https://stackoverflow.com/");
        driver.navigate().back(); // Thread.sleep(3000); driver.navigate().forward(); driver.navigate().refresh();
        driver.quit();

    }

}

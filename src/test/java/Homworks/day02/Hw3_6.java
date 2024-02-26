package Homworks.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hw3_6 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.gecko.driver","resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        String titleOfThePage = driver.getTitle();
        System.out.println("titleOfThePage = " + titleOfThePage);
        if (titleOfThePage.contains("video"))
            System.out.println("It contains the word 'video'");
        else System.out.println("It does not contain that one");
        driver.manage().window().minimize();
        titleOfThePage = driver.getTitle();
        System.out.println("titleOfThePage = " + titleOfThePage);
        if (titleOfThePage.contains("video"))
            System.out.println("It contains the word 'video'");
        else
            System.out.println("It does not contain that one");
        driver.manage().window().fullscreen();
        driver.quit();
  }

}

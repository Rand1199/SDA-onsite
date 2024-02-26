package Homworks.day02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        System.out.println("Position="+driver.manage().window().getPosition());
        System.out.println("Size= "+driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(7000);
        System.out.println("Size= "+driver.manage().window().getSize());
        System.out.println("Position= "+driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        driver.quit();
    }

}

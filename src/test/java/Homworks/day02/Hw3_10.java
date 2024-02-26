package Homworks.day02;

import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_10 {
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");  }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close(); }

}

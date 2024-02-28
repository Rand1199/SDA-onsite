package Homworks.day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Hw2 {
    static WebDriver driver ;
    @BeforeClass
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown(){
        //   driver.quit();

    }
    @Test
    public void test(){
        // Select the Old Style Select Menu using the element id
        WebElement oldStyleSelect = driver.findElement(By.id("oldSelectMenu"));
        Select selectMenu = new Select(oldStyleSelect);

        // Print all the options of the dropdown
        List<WebElement> options = selectMenu.getOptions();
        System.out.println("Options in the dropdown:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Select 'Purple' using the index
        selectMenu.selectByIndex(3); // Index starts from 0

        // Select 'Magenta' using visible text
        selectMenu.selectByVisibleText("Magenta");

        // Select an option using value
        selectMenu.selectByValue("10");
    }
}

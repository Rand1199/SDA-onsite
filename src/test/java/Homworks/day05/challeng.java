package Homworks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class challeng {


    WebDriver driver;

    @Test
    public void test01(){
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        String todoText = "test TODO";
        driver.findElement(By.tagName("input")).sendKeys(todoText + Keys.ENTER);
        List<WebElement> todoList = driver.findElements(By.xpath("//ul/li"));

        boolean result = false;
        for (WebElement w: todoList){
            if (w.getText().equals(todoText)){
                result = true;
            }
        }
        Assert.assertTrue(result);

        driver.findElement(By.xpath("//*[contains(text(), 'test')]/span/i")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        todoList = driver.findElements(By.xpath("//ul/li"));
        for (WebElement w: todoList){
            if (w.getText().equals(todoText)){
                result = false;
            }
        }
        Assert.assertTrue(result);
        WebElement completedTODO = driver.findElement(By.xpath("//li[contains(text(), 'Go to potion class')]"));
        completedTODO.click();
        result = completedTODO.getAttribute("class").equals("completed");
        Assert.assertTrue(result);
    }
}

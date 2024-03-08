package Homworks.day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Hw3 extends TestBase {


    @Test
    public void test (){
        // Navigate to the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/");


        // Enter valid credentials and click login
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));

        username.sendKeys("admin");
        password.sendKeys("admin123");
        loginButton.click();

        // Click on PIM in the left sidebar
        WebElement pimMenu = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]"));
        pimMenu.click();



        // Click on Configuration from the dropdown list
        WebElement configurationDropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]"));
        configurationDropdown.click();


        // Select Data Import
        WebElement dataImport = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[3]"));
        dataImport.click();

        // Download sample CSV file
        driver.findElement(By.linkText("Download")).click();

        // Specify the path of the download directory
        String downloadDir = "C:\\Users\\Rm506\\Downloads";
        String fileName = "importData.csv"; // Name of the downloaded file
        String pathOfFile = downloadDir + "\\" + fileName;

        // Check if the file exists
        boolean isExist = Files.exists(Paths.get(pathOfFile));

        if (isExist) {
            System.out.println("File downloaded successfully.");
        } else {
            System.out.println("File download failed or file does not exist.");
        }
    }
}

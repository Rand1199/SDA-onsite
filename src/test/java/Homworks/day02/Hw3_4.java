package Homworks.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_4 {
    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/");
// Print the position and size of the page.
    System.out.println("Position = " + driver.manage().window().getPosition());
    System.out.println("Size = " + driver.manage().window().getSize());
//Adjust the position and size of the page as desired. driver.manage().window().setPosition(new Point(80, 30)); driver.manage().window().setSize(new Dimension(800, 400));
// Test that the page is in the position and size you want.
    int X = driver.manage().window().getPosition().getX();
    int Y = driver.manage().window().getPosition().getY();
    int width = driver.manage().window().getSize().width;
    int height = driver.manage().window().getSize().height;
    if(X==80 && Y==80 && width==800 && height==400){
        System.out.println("PASSED");
    } else { System.err.println("FAILED");
    }
//Close the page.
    driver.close();
}

}

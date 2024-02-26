package Day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04WindowsCommands {

    public static void main(String[] args) throws InterruptedException {
         /*
        Open URL: https://www.google.com/
        Maximize the window.
        Print the position and size of the page.
        Minimize the page.
        Wait 5 seconds in the icon state and maximize the page.
        Print the position and dimensions of the page in maximized state.
        Make the page fullscreen.
        Close the Browser.

         */
        WebDriver driver = new ChromeDriver();

        // Open URL: https://www.google.com/
        driver.get("https://www.google.com/");
        // Maximize the window.
        driver.manage().window().maximize();
        // Print the position and size of the page.
        Point pas1=driver.manage().window().getPosition();
        int xCoor =pas1.getX();
        int yCoor =pas1.getY();
        System.out.println("pas1.toString() = " + pas1.toString());
        System.out.println("yCoor = " + yCoor);
        System.out.println("xCoor = " + xCoor);

        Dimension s1= driver.manage().window().getSize();
        System.out.println("s1.getWidth() = " + s1.getWidth());
        System.out.println("s1.getHeight() = " + s1.getHeight());
        System.out.println("s1.toString() = " + s1.toString());

        // Minimize the page.
        driver.manage().window().maximize();

        // Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
        driver.manage().window().maximize();

        // Print the position and dimensions of the page in maximized state.
        Point pas2=driver.manage().window().getPosition();
        Dimension s2= driver.manage().window().getSize();
        System.out.println("pas2.toString() = " + pas2.toString());
        System.out.println("s2.toString() = " + s2.toString());

        // Make the page fullscreen.
        driver.manage().window().fullscreen();
        // Close the Browser.
        driver.quit();
    }
}

package Day02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BeforeClassAfterClassAnnotation {

     static WebDriver driver;
    @BeforeClass
    public static void beforeclass (){
       driver=new ChromeDriver();
        System.out.println("Before class method is executed ...");

    }

    @AfterClass
    public static void afterclass(){

        driver.close();


    }

    @Test
    public void test1 (){

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Test 1 :");
    }

    @Test
    public void test2 (){

        driver.get("https://www.clarusway.com");
        driver.manage().window().maximize();
        System.out.println("Test 2 :");

    }
}

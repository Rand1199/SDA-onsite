package Day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C03TestNG {

   //Create tests that depend on each other
   //Create beforeClass and set up settings.
   //By creating interdependent tests;
   //First go to Facebook.
   //Then go to Google depending on Facebook,
   //Then go to Amazon depending on Google
   //Close the driver.

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Set up WebDriver

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFacebook() {
        // Test to go to Facebook
        driver.get("https://www.facebook.com/");
        // Add your test assertions here
    }

    @Test(dependsOnMethods = "testFacebook")
    public void testGoogle() {
        // Test to go to Google
        driver.get("https://www.google.com/");
        // Add your test assertions here
    }

    @Test(dependsOnMethods = "testGoogle")
    public void testAmazon() {
        // Test to go to Amazon
        driver.get("https://www.amazon.com/");
        // Add your test assertions here
    }

    @AfterClass
    public static void tearDown() {
        // Close the browser
        driver.quit();
    }
}

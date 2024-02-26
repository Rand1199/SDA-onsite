package Homworks.day02;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3_9 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.3schools.com");
        driver.manage().window().maximize(); }

    @AfterClass
    public static void tearDown() {
        driver.close(); }

    @Before
    public void beforeClass () {
        System.out.println("STARTED");
        System.out.println("Test has started");  }

    @After
    public void afterClass () {
        System.out.println("FINISHED");
        System.out.println("Test finished");  }

    @Test
    public void test01() {
        driver.manage().window().minimize();
        boolean isTitleContain = driver.getTitle().contains("W3Schools");
        Assert.assertTrue(isTitleContain);
        System.out.println("Test01 is running"); }

    @Test
    public void test02() {
        driver.manage().window().fullscreen();
        boolean isTitleContain = driver.getTitle().contains("boss");
        Assert.assertFalse(isTitleContain);
        System.out.println("Test02 is running"); }

}

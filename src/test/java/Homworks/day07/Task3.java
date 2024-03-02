package Homworks.day07;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Task3 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }

    @Test
    public void test(){
        Wait<WebDriver> wait = new FluentWait<>(driver);
        // Clicking on "Click me, to Open an alert after 5 seconds" button
        WebElement alertButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert")));
        alertButton.click();

        // Handling the alert
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // Clicking on "Change Text to Selenium Webdriver" button
        WebElement changeTextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("populate-text")));
        changeTextButton.click();

        // Verifying if "Selenium Webdriver" message is displayed
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicText")));
        String message = messageElement.getText();
        if (message.equals("Selenium Webdriver")) {
            System.out.println("Verification Successful - Message displayed: " + message);
        } else {
            System.out.println("Verification Failed - Expected message not displayed.");
        }

        // Clicking on "Display button after 10 seconds" button
        WebElement displayButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("display-other-button")));
        displayButton.click();

        // Verifying if the button is displayed
        WebElement displayedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
        if (displayedButton.isDisplayed()) {
            System.out.println("Button Displayed Successfully.");
        } else {
            System.out.println("Button Not Displayed.");
        }

        // Clicking on "Enable button after 10 seconds" button
        WebElement enableButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("enableAfter")));
        enableButton.click();

        // Verifying if the button is enabled
        WebElement enabledButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("disabled")));
        if (enabledButton.isEnabled()) {
            System.out.println("Button Enabled Successfully.");
        } else {
            System.out.println("Button Not Enabled.");
        }

        // Clicking on "Check Checkbox after 10 seconds" button
        WebElement checkboxButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkBox")));
        checkboxButton.click();

        // Verifying if the checkbox is checked
        WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("isAgeSelected")));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox Checked Successfully.");
        } else {
            System.out.println("Checkbox Not Checked.");
        }

        // Closing the browser
       // driver.quit();
    }

    }


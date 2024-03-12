package Day13;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.TestBase;

public class C03Log4j extends TestBase {
    //Go to URL: https://healthunify.com/bmicalculator/
    //Entring weight
    //Selecting kilograms
    //Selecting height in feet
    //Selecting height in inchs
    //Clicking on calculate
    //Getting SIUnit value
    //Getting USUnit value
    //Getting UKUnit value
    //Getting overall description
    @Test
    public void test(){
        Logger logger = Logger.getLogger(C03Log4j.class);
// Go to the BMI calculator URL
        driver.get("https://healthunify.com/bmicalculator/");

        // Enter weight
        WebElement weightField;
        weightField = driver.findElement(By.name("wg"));
        weightField.sendKeys("70");
        logger.info("Entered weight: 70");

        // Select kilograms
        WebElement weightUnit = driver.findElement(By.name("opt1"));
        Select selectWeightUnit = new Select(weightUnit);
        selectWeightUnit.selectByVisibleText("kilograms");
        logger.info("Selected kilograms");

        // Select height in feet
        WebElement heightFeetField = driver.findElement(By.name("opt2"));
        Select selectHeightFeet = new Select(heightFeetField);
        selectHeightFeet.selectByIndex(4);
        logger.info("Selected height in feet");

        // Select height in inches
        WebElement heightInchesField = driver.findElement(By.name("opt3"));
        Select selectHeightInches = new Select(heightInchesField);
        selectHeightInches.selectByIndex(10);
        logger.info("Selected height in inches");

        // Click on calculate
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        logger.info("Clicked on Calculate button");

        // Getting SIUnit value
        String siUnit = driver.findElement(By.name("si")).getAttribute("value");
        logger.info("SIUnit: " + siUnit);

        // Getting USUnit value
        String usUnit = driver.findElement(By.name("us")).getAttribute("value");
        logger.info("USUnit: " + usUnit);

        // Getting UKUnit value
        String ukUnit = driver.findElement(By.name("uk")).getAttribute("value");
        logger.info("UKUnit: " + ukUnit);

        // Getting overall description
        String description = driver.findElement(By.name("desc")).getAttribute("value");
        logger.info("Overall Description: " + description);
    }
    }


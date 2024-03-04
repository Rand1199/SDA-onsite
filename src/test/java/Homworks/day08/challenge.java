package Homworks.day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.TestBase;

import java.util.List;

import static org.junit.Assert.*;

public class challenge extends TestBase {

    @Test

    public void test() {
driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        driver.switchTo().frame(0);
        //enter first name
         WebElement firstName =driver.findElement(By.xpath("//*[@elname='First']"));
         firstName.sendKeys("Rand");
         // enter last name
        WebElement lastName =driver.findElement(By.xpath("//*[@elname='Last']"));
        lastName.sendKeys("Almjmaj");

        //radio Button
         List<WebElement>Radio= driver.findElements(By.className("tempContDiv"));
         Radio.get(1).click();

         //DropDown
        WebElement element= driver.findElement(By.id("Dropdown-arialabel"));
        Select select = new Select(element);
        select.selectByIndex(2);


        Assert.assertNotNull("First name should not be null", firstName.getAttribute("value"));
        Assert.assertTrue("Dropdown should be chosen", select.getFirstSelectedOption().getText().equals("Second Choice"));

        //checkBox
        List<WebElement> checkbox= driver.findElements(By.xpath("//*[@id=\"Checkbox-li\"]"));
        System.out.println(checkbox.size());

        // check box
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@for='Checkbox_1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@for='Checkbox_2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//*[@for='Checkbox_3']"));

        checkbox1.click();
        checkbox3.click();

        //stars
        WebElement s1 = driver.findElement(By.xpath("//*[@aria-label='1 Star']"));
        WebElement s2 = driver.findElement(By.xpath("//*[@aria-label='2 Star']"));
        WebElement s3 = driver.findElement(By.xpath("//*[@aria-label='3 Star']"));
        WebElement s4 = driver.findElement(By.xpath("//*[@aria-label='4 Star']"));
        WebElement s5 = driver.findElement(By.xpath("//*[@aria-label='5 Star']"));

        s4.click();

        // Assertions for Rating

        // Get the current value of the selected rating
        String selectedRating = s4.getAttribute("aria-label");

// Extract the numeric value from the rating
        int numericValue = Integer.parseInt(selectedRating.split(" ")[0]);

// Assertion for Rating - Star 3 should have numeric value 3
        Assert.assertEquals(3, numericValue);


        //submit
        WebElement submit =driver.findElement(By.xpath("//*[@class='fmSmtButton submitColor submitWrapper fmSmtButtom']"));
        submit.click();

    }

}
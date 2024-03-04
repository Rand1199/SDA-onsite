package Homworks.day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.TestBase;

public class Hw01 extends TestBase {

    @Test
    public void test(){
        // Navigate to the URL
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        // Instantiate Actions class
        Actions actions = new Actions(driver);

        // Locate BANK button and Account section in DEBIT SIDE
        WebElement bankButton = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
        WebElement accountDebit = driver.findElement(By.xpath("//ol[@id='bank']"));

        // Drag and drop BANK button to Account section in DEBIT SIDE
        actions.dragAndDrop(bankButton, accountDebit).build().perform();

        // Locate SALES button and Account section in CREDIT SIDE
        WebElement salesButton = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
        WebElement accountCredit = driver.findElement(By.xpath("//ol[@id='loan']"));

        // Drag and drop SALES button to Account section in CREDIT SIDE
        actions.dragAndDrop(salesButton, accountCredit).build().perform();

        // Locate 5000 button and Amount section in DEBIT SIDE
        WebElement amount5000Debit = driver.findElement(By.xpath("//li[@id='fourth']"));
        WebElement amountDebit = driver.findElement(By.xpath("//ol[@id='amt7']"));

        // Drag and drop 5000 button to Amount section in DEBIT SIDE
        actions.dragAndDrop(amount5000Debit, amountDebit).build().perform();

        // Locate second 5000 button and Amount section in CREDIT SIDE
        WebElement amount5000Credit = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
        WebElement amountCredit = driver.findElement(By.xpath("//ol[@id='amt8']"));

        // Drag and drop second 5000 button to Amount section in CREDIT SIDE
        actions.dragAndDrop(amount5000Credit, amountCredit).build().perform();

        // Verify the visibility of Perfect text
        WebElement perfectText = driver.findElement(By.xpath("//a[text()='Perfect!']"));
        assert perfectText.isDisplayed();





    }
}

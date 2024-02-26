package Homworks.day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HwTemu {
//1.Go to https://www.temu.com/.
// 2.Type "iphone" in the search bar and click ENTER.
//3.Print the result number.
//4.Click on the first product that appears.
//5.Add to cart.
//6.Click on the cart icon.
//7.Print the product price
//8.Complete your shopping..
//9.Turn off the driver.
// searchBox= By.name("q");
//  By results= By.className("_1TKvD9PP");
 @Test
 public void test(){
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
  //      //1.Go to https://www.temu.com/.
    driver.get("https://www.temu.com/");
//
  //      // 2.Type "iphone" in the search bar and click ENTER.
  //     driver.findElement(searchBox).sendKeys("iphone"+ Keys.ENTER);
  //      //3.Print the result number.
  //      String totalResult = driver.findElement(results).getText();
  //      System.out.println("Result = " + totalResult);
  //  }
  //  // 2. Type "iphone" in the search bar and click ENTER.
    WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone");
        searchBox.submit();

    // 3. Print the result number.
    WebElement resultNumber = driver.findElement(By.className("result-count"));
        System.out.println("Result number: " + resultNumber.getText());

    // 4. Click on the first product that appears.
    WebElement firstProduct = driver.findElement(By.className("product"));
        firstProduct.click();

    // 5. Add to cart.
    WebElement addToCartButton = driver.findElement(By.className("add-to-cart"));
        addToCartButton.click();

    // 6. Click on the cart icon.
    WebElement cartIcon = driver.findElement(By.className("cart-icon"));
        cartIcon.click();

    // 7. Print the product price
    WebElement productPrice = driver.findElement(By.className("product-price"));
        System.out.println("Product price: " + productPrice.getText());

    // 8. Complete your shopping..
    // Assuming there's a checkout process here

    // 9. Turn off the driver.
        driver.quit();
}
}


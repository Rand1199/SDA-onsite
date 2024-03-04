package Day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.TestBase;

import java.time.Duration;

public class C04HorizantalSlider extends TestBase {
   // Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
   // Shift 100 units to the right and 100 units to the left on the horizontal axis.

    @Test
    public void test() {
By slider =By.xpath("//div[@class='range-slider vertical-range']/span[1]");
        // Navigate to the URL
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        // Locate the range slider element
        WebElement sliderButton = driver.findElement(slider);
        actions
                .dragAndDropBy(sliderButton,0,-32)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton,0,32)
                .perform();

    }
}
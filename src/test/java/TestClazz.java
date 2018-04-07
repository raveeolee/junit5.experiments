import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(WebDriverResolver.class)
public class TestClazz {

    @Test
    public void first(WebDriver driver) {
        driver.get("http://google.com");
        assertFalse(driver.findElements(By.cssSelector("img[alt='Google']")).isEmpty());
    }
}

package mpack;

import driver.DriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstClass {

    @Test
    void openBrowser() {
        WebDriver driver = DriverFactory.createDriver();

        driver.get("https://www.google.com");

        System.out.println("Title of the page is: " + driver.getTitle());

        assertEquals("Google", driver.getTitle());

        driver.quit();
    }
}
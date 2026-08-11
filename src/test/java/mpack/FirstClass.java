package mpack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstClass {

    private WebDriver driver;

    @Test
    void openGoogle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        String pageTitle = driver.getTitle();

        System.out.println("Title of the page is: " + pageTitle);

        assertEquals("Google", pageTitle, "Page title is not correct");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
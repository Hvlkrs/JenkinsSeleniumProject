package tests;

import base.BaseTest;
import config.ConfigReader;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    void validUserCanLogin() {
        driver.get(ConfigReader.getBaseUrl());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(
                ConfigReader.getSauceUsername(),
                ConfigReader.getSaucePassword()
        );

        assertEquals(
                "https://www.saucedemo.com/inventory.html",
                driver.getCurrentUrl()
        );
    }
}
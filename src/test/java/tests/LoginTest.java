package tests;

import base.BaseTest;
import config.ConfigReader;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.InventoryPage;
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

    @Test
    void invalidUserCannotLogin() {
        driver.get(ConfigReader.getBaseUrl());

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "invalid_user",
                "wrong_password"
        );

        assertEquals(
                "Epic sadface: Username and password do not match any user in this service",
                loginPage.getErrorMessage()
        );
    }

    @Test
    void userCanAddBackpackToCart() {
        driver.get(ConfigReader.getBaseUrl());

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getSauceUsername(),
                ConfigReader.getSaucePassword()
        );

        InventoryPage inventoryPage = new InventoryPage(driver);

        assertEquals(
                "Products",
                inventoryPage.getPageTitle()
        );

        inventoryPage.addBackpackToCart();

        assertEquals(
                "1",
                inventoryPage.getCartItemCount()
        );

        inventoryPage.openCart();

        CartPage cartPage = new CartPage(driver);

        assertEquals(
                "Sauce Labs Backpack",
                cartPage.getItemName()
        );

        assertEquals(
                "$29.99",
                cartPage.getItemPrice()
        );
    }
}
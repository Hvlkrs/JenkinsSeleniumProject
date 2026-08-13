package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class CartPage {

    private final WebDriver driver;
    private final WaitUtils waitUtils;

    private final By cartItemName =
            By.cssSelector(".inventory_item_name");

    private final By cartItemPrice =
            By.cssSelector(".inventory_item_price");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public String getItemName() {
        return waitUtils.waitForElementVisible(cartItemName)
                .getText();
    }

    public String getItemPrice() {
        return waitUtils.waitForElementVisible(cartItemPrice)
                .getText();
    }
}
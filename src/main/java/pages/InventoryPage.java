package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class InventoryPage {

    private final WebDriver driver;
    private final WaitUtils waitUtils;

    private final By pageTitle = By.cssSelector(".title");
    private final By backpackAddToCartButton =
            By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCartBadge =
            By.cssSelector(".shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public String getPageTitle() {
        return waitUtils.waitForElementVisible(pageTitle).getText();
    }

    public void addBackpackToCart() {
        waitUtils.waitForElementClickable(backpackAddToCartButton)
                .click();
    }

    public String getCartItemCount() {
        return waitUtils.waitForElementVisible(shoppingCartBadge)
                .getText();
    }
}
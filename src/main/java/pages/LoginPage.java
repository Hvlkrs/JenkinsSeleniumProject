package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LoginPage {

    private final WebDriver driver;
    private final WaitUtils waitUtils;

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public void enterUsername(String username) {
        waitUtils.waitForElementVisible(usernameInput)
                .sendKeys(username);
    }

    public void enterPassword(String password) {
        waitUtils.waitForElementVisible(passwordInput)
                .sendKeys(password);
    }

    public void clickLogin() {
        waitUtils.waitForElementClickable(loginButton)
                .click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
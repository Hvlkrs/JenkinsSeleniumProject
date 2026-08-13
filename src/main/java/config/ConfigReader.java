package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input != null) {
                properties.load(input);
            }

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getBaseUrl() {
        return getValue("BASE_URL", "base.url", "https://www.saucedemo.com/");
    }

    public static String getSauceUsername() {
        return getValue("SAUCE_USERNAME", "sauce.username", "standard_user");
    }

    public static String getSaucePassword() {
        return getValue("SAUCE_PASSWORD", "sauce.password", "secret_sauce");
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(
                getValue("HEADLESS", "headless", "true")
        );
    }

    private static String getValue(
            String environmentVariable,
            String property,
            String defaultValue) {

        String envValue = System.getenv(environmentVariable);

        if (envValue != null && !envValue.isBlank()) {
            return envValue;
        }

        String propertyValue = properties.getProperty(property);

        if (propertyValue != null && !propertyValue.isBlank()) {
            return propertyValue;
        }

        return defaultValue;
    }
}
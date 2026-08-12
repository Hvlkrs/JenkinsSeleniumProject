package config;

public class ConfigReader {

    public static String getSauceUsername() {
        return getValue("SAUCE_USERNAME", "standard_user");
    }

    public static String getSaucePassword() {
        return getValue("SAUCE_PASSWORD", "secret_sauce");
    }

    public static String getBaseUrl() {
        return getValue("BASE_URL", "https://www.saucedemo.com/");
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(getValue("HEADLESS", "true"));
    }

    private static String getValue(String key, String defaultValue) {
        String value = System.getenv(key);

        if (value == null || value.isBlank()) {
            return defaultValue;
        }

        return value;
    }
}
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

            if (input == null) {
                throw new RuntimeException("config.properties not found");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getBaseUrl() {
        return getValue("BASE_URL", "base.url");
    }

    public static String getSauceUsername() {
        return getValue("SAUCE_USERNAME", "sauce.username");
    }

    public static String getSaucePassword() {
        return getValue("SAUCE_PASSWORD", "sauce.password");
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(
                getValue("HEADLESS", "headless")
        );
    }

    private static String getValue(String environmentVariable, String property) {

        String envValue = System.getenv(environmentVariable);

        if (envValue != null && !envValue.isBlank()) {
            return envValue;
        }

        return properties.getProperty(property);
    }
}
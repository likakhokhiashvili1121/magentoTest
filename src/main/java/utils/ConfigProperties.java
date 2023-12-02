package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ConfigProperties {

    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = ConfigProperties.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
            } else {
                properties.load(input);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}

/*
public class ConfigProperties {

    protected static Properties configProperties;

    static {
        configProperties = new Properties();
        try {
            configProperties.load(BasePage.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new IllegalStateException("config.properties is not loaded", e);
        }
    }

    public static String getProperty(String property) {
        return configProperties.getProperty(property);
    }

}

 */
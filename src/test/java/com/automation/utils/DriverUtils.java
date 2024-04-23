package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverUtils {

    static AppiumDriver driver;

    // Method to create driver, and it will get called from Hooks
    public static void createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "RZ8N9250P5Z");
        capabilities.setCapability("appium:app", "C:\\Users\\khima\\Documents\\Automation Code\\MobileAutomationFramework\\expedia.apk");

        driver = new AppiumDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    // Anywhere we need driver, we will call this method
    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void main(String[] args) {
        ConfigReader.loadProperties();
        System.out.println(ConfigReader.getProperty("platform.name"));
    }

}

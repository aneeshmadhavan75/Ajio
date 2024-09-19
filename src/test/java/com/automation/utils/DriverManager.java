package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver() {

        if (ConfigReader.getConfigValue("execute").equals("web")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } else {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            desiredCapabilities.setCapability("app", "C://Users//280680//Downloads//Ajio1.apk");
            desiredCapabilities.setCapability("appPackage", "com.ril.ajio");
            desiredCapabilities.setCapability("appActivity", "com.ril.ajio.launch.activity.SplashScreenActivity");
            desiredCapabilities.setCapability("autoGrantPermissions", false);
            driver = new AppiumDriver(desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

    }

    public static WebDriver getDriver() {
        return DriverManager.driver;
    }
}

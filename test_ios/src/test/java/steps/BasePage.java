package steps;

import fraemwork.IosDriver;
import io.appium.java_client.ios.IOSDriver;

public class BasePage {
    public static IOSDriver getDriver() {
        return IosDriver.getDriver();
    }
}

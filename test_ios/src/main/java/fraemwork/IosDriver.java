package fraemwork;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosDriver {

    private static IOSDriver iosDriver;

    public static IOSDriver getDriver() {
        if(iosDriver == null){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "iPhone Simulator");
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("platformVersion", "11.3");
        desiredCapabilities.setCapability("app", "settings");
        desiredCapabilities.setCapability("noReset", "true");

        try {
            iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            System.out.println("URL is null");
        }
        }
        return iosDriver;

    }

}

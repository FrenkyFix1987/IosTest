package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTestClass extends BasePage{



    @When("opened app settings")
    public void firstTest(){
        getDriver().findElement(By.name("General"));
    }

    @And("clicked on button gender")
    public void click(){
        getDriver().findElement(By.name("General")).click();
    }
}

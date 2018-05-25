package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

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

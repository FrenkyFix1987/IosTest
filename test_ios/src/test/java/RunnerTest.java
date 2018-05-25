import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import fraemwork.IosDriver;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        tags = "@all"
)
public class RunnerTest {
    @After
    public void closeDriver(){
        IosDriver.getDriver().close();
    }
}

package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "StepDefinations"
)
public class TestRunner extends AbstractTestNGCucumberTests {


}

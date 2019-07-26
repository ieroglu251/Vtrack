package CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "StepsDefinations"
)
public class TestRunner extends AbstractTestNGCucumberTests {


}

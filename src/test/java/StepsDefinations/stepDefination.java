package StepsDefinations;

import Resources.BaseUtilities;
import cucumber.api.java.en.Given;

public class stepDefination extends BaseUtilities {


    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = InitializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_Site(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg1);
    }


}

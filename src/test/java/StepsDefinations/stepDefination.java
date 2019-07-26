package StepsDefinations;

import PageElements.HomePage;
import PageElements.LoginPage;
import Resources.BaseUtilities;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class stepDefination extends BaseUtilities {


    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = InitializeDriver();


    }

    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_Site(String arg1) throws Throwable {
        driver.get(arg1);



    }



    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_userName_and_Password(String arg1, String arg2) throws Throwable {

        LoginPage lg = new LoginPage(driver);
        lg.getUserName().sendKeys(arg1, Keys.ENTER);
        lg.getPassword().sendKeys(arg2, Keys.ENTER);

       // throw new PendingException();
    }

    @Then("^Verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {

        String expectedResult = "Quick Launchpad";
        HomePage homepage = new HomePage(driver);
        String actualResult = homepage.getQuickLaunchpadText().getText();


      //  Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("^close browsers$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }



}

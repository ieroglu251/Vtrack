package Vytrack;

import PageElements.Activities;
import Resources.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActivitiesCalendarEventsTest extends BaseUtilities {

    WebDriver driver;

    @BeforeTest
    public void initialize()throws IOException {
        driver = InitializeDriver();

    }

    @BeforeMethod
    public void LoginTest(){

        driver.get(prop.getProperty("url"));
        PageElements.LoginPage lg = new PageElements.LoginPage(driver);
        lg.getUserName().sendKeys("user175", Keys.ENTER);
        lg.getPassword().sendKeys("UserUser123");
        lg.getLoginButton().click();

    }

    @Test
    public void GoToActivitiesPage(){
        Activities act = new Activities(driver);


        Actions moveacts = new Actions(driver);
        moveacts.moveToElement(act.getActivit()).build().perform();
        BaseUtilities.wait(5);
        moveacts.moveToElement(act.getCalanderEvents()).click().build().perform();
        BaseUtilities.wait(5);

        //click on create event btn
        act.getCreateCalanderEvents().click();
        BaseUtilities.wait(2);
        //check repeat box
        act.getRepeatCheckBox().click();
        BaseUtilities.wait(5);
        Assert.assertTrue(act.getRepeatCheckBox().isSelected());


    }


    @AfterTest
    public void teardown()
    {

        BaseUtilities.wait(5);
        driver.close();
        driver=null;

    }
}

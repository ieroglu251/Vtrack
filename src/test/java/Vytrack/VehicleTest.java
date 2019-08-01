package Vytrack;

import PageElements.FleetPage;
import PageElements.HomePage;
import PageElements.Vehicles;
import Resources.BaseUtilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class VehicleTest extends BaseUtilities {

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
    public void HomePageTest(){
        HomePage HmpgTst = new HomePage(driver);
        FleetPage fleetTst = new FleetPage(driver);
        Actions moveToTabs = new Actions(driver);
        moveToTabs.moveToElement(HmpgTst.fleet()).build().perform();
        BaseUtilities.wait(2);
        moveToTabs.moveToElement(fleetTst.vehicle()).click().build().perform();



    }
    @Test
    public void vehiclesPageTest(){
        HomePageTest();
        BaseUtilities.wait(4);
        Vehicles vhc = new Vehicles();
        String expectedResult = "Cars";
        String actualResult = vhc.carText().getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @AfterTest
    public void teardown()
    {

        BaseUtilities.wait(5);
        driver.close();
        driver=null;

    }
}

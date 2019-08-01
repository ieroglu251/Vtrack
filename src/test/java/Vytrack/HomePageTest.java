package Vytrack;

import PageElements.HomePage;
import Resources.BaseUtilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class HomePageTest extends  BaseUtilities{

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
        Actions moveToTabs = new Actions(driver);
        moveToTabs.moveToElement(HmpgTst.fleet()).build().perform();
        BaseUtilities.wait(2);
        moveToTabs.moveToElement(HmpgTst.customers()).build().perform();
        BaseUtilities.wait(2);
        moveToTabs.moveToElement(HmpgTst.activities()).build().perform();
        BaseUtilities.wait(2);
        moveToTabs.moveToElement(HmpgTst.system()).build().perform();
    }

    @AfterTest
    public void teardown()
    {

        BaseUtilities.wait(5);
        driver.close();
        driver=null;

    }

}

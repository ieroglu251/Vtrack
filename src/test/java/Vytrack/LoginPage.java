package Vytrack;

import Resources.BaseUtilities;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPage extends BaseUtilities {

    @BeforeTest
    public void initialize()throws IOException {
        driver = InitializeDriver();

    }

    @Test
    public void LoginTest(){

        driver.get(prop.getProperty("url"));
        PageElements.LoginPage lg = new PageElements.LoginPage(driver);
        lg.getUserName().sendKeys("user175", Keys.ENTER);
        lg.getPassword().sendKeys("UserUser123");
        lg.getLoginButton().click();

    }

    @AfterTest
    public void teardown()
    {

        BaseUtilities.wait(5);
        driver.close();
        driver=null;

    }
}

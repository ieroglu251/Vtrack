package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

//    @FindBy(id = "prependedInput")
//    WebElement userNameLocator;
    public WebElement getUserName(){
        return driver.findElement(By.id("prependedInput"));
    }

//    @FindBy(id = "prependedInput2")
//    WebElement PasswordLocator;
    public WebElement getPassword(){
        return  driver.findElement(By.id("prependedInput2"));
    }

//    @FindBy(id = "_submit")
//    WebElement LoginButtonLocator;
    public WebElement getLoginButton(){
        return  driver.findElement(By.id("_submit"));
    }
}

package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By AccountsListLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/ul/li/a");
    public WebElement getAccountsList(){
        return driver.findElement(AccountsListLocator);
    }

    By QuickLaunchpadLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1");
    public WebElement getQuickLaunchpadText(){
        return driver.findElement(QuickLaunchpadLocator);
    }

}

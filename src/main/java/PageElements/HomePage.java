package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }





    By FleetManagementTextLocator = By.xpath("//*[@id=\"organization-switcher\"]/div/h1/a");
    public WebElement FleetManagementText(){
        return driver.findElement(FleetManagementTextLocator);
    }

    By ShortCutsLocator = By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/a/i");
    public WebElement Shortcuts(){
        return driver.findElement(ShortCutsLocator);
    }

    By LearnHowToUseThisSpaceLocator = By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a");
    public WebElement LearnHowToUseThisSpace(){
        return driver.findElement(LearnHowToUseThisSpaceLocator);
    }

    By GetHelpLocator = By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[1]/a/i");
    public WebElement GetHelp(){
        return driver.findElement(GetHelpLocator);
    }

    By ThreebarsLocator = By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[2]/a/i");
    public WebElement ThreeBars(){
        return driver.findElement(ThreebarsLocator);
    }

    By RecentEmailsLocator = By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[3]/a/i");
    public WebElement RecentEmails(){
        return driver.findElement(RecentEmailsLocator);
    }

    By UserNameLocator = By.xpath("//*[@id=\"user-menu\"]/a");
    public WebElement userName(){
        return driver.findElement(UserNameLocator);
    }

    By FleetLocator = By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span");
    public WebElement fleet(){
        return driver.findElement(FleetLocator);
    }

    By CustomersLocator = By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span");
    public WebElement customers(){
        return driver.findElement(CustomersLocator);
    }

    By ActivitiesLocstor = By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span");
    public WebElement activities(){
        return driver.findElement(ActivitiesLocstor);
    }

    By SystemLocator = By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a/span");
    public WebElement system(){
        return driver.findElement(SystemLocator);
    }


    By QuickLaunchpadLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1");
    public WebElement getQuickLaunchpadText(){
        return driver.findElement(QuickLaunchpadLocator);
    }

    By AccountsListLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/ul/li/a");
    public WebElement getAccountsList(){
        return driver.findElement(AccountsListLocator);
    }

    By ContactListLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a");
    public WebElement contactList(){
        return driver.findElement(ContactListLocator);
    }

    By ContactsCreateContactLocator = By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/ul/li[2]/a");
    public WebElement ContactsCreateContact(){
        return driver.findElement(ContactsCreateContactLocator);
    }

    By SidebarWidgetsLocator = By.xpath("//*[@id=\"sidebar-right\"]/button[2]");
    public WebElement sideWidgets (){
        return driver.findElement(SidebarWidgetsLocator);
    }


}

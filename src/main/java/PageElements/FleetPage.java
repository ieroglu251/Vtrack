package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FleetPage {

    //use scc selector

    WebDriver driver;

    public FleetPage(WebDriver driver){
        this.driver = driver;
    }

    By VehicleLocator = By.cssSelector(" #main-menu > ul > li:nth-child(1) > div > div > ul > li.dropdown-menu-single-item.first > a > span ");
    public WebElement vehicle(){
        return driver.findElement(VehicleLocator);
    }

    By VehicleOdometerLocator = By.cssSelector("#main-menu > ul > li:nth-child(1) > div > div > ul > li:nth-child(4) > a > span");
    public WebElement vehicleOdometer(){
        return driver.findElement(VehicleOdometerLocator);
    }

    By VehicleCostLocator = By.cssSelector("#main-menu > ul > li:nth-child(1) > div > div > ul > li:nth-child(5) > a > span");
    public WebElement vehicleCost(){
        return driver.findElement(VehicleCostLocator);
    }

    By VehicleContractLocator = By.cssSelector("#main-menu > ul > li:nth-child(1) > div > div > ul > li:nth-child(6) > a > span");
    public WebElement vehicleContract(){
        return driver.findElement(VehicleContractLocator);
    }

    By VehicleFuelLogsLocator = By.cssSelector("#main-menu > ul > li:nth-child(1) > div > div > ul > li:nth-child(7) > a > span");
    public WebElement vehicleFuelLogs(){
        return driver.findElement(VehicleFuelLogsLocator);
    }




}

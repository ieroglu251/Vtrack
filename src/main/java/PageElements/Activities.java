package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activities {

    WebDriver driver;
    public Activities(WebDriver driver){
        this.driver = driver;
    }
   By activitPageLocator = By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span");

    public WebElement getActivit() {
        return driver.findElement(activitPageLocator);
    }

    By calanderEventsLocatir = By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a");
    public WebElement getCalanderEvents(){
        return driver.findElement(calanderEventsLocatir);
    }

    By createCalanderEventLocator = By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a");
    public WebElement getCreateCalanderEvents(){
        return driver.findElement(createCalanderEventLocator);
    }

    By RepeatCheckBoxLocator = By.id("recurrence-repeat-view242");
    public WebElement getRepeatCheckBox(){
        return driver.findElement(RepeatCheckBoxLocator);
    }

}

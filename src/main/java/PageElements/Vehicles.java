package PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehicles {
WebDriver driver;
//    @FindBy(css = "#container > div.container-fluid.page-title > div > div > div.pull-left.pull-left-extra > div > h1")
//    public WebElement carText;
    By carText = By.cssSelector("#container > div.container-fluid.page-title > div > div > div.pull-left.pull-left-extra > div > h1");
    public WebElement carText(){
        return driver.findElement(carText);
    }

}

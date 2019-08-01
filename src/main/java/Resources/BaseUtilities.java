package Resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseUtilities {

    public WebDriver driver;
    public Properties prop;


    public WebDriver InitializeDriver()throws IOException {

        prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\ieroglu\\ieroglu_github\\Vtrack\\src\\main\\java\\Resources\\Data.properties");
        prop.load(file);

        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ieroglu\\Dependencies\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

       else if(browserName.equals("firefox")){
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\ieroglu\\Dependencies\\Drivers\\geckodriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equals("IE"))
        {
//	IE code
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static void wait(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

//    public void getScreenshot(String result) throws IOException
//    {
//        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////        FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
//
//    }
//
//    public static String getScreenshot(String name)  {
//        // name the screenshot with the current date time to avoid duplicate name
//        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_hh:mm:ss a"));
//        // TakesScreenshot ---> interface from selenium which takes screenshots
//        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        // full path to the screenshot location
//        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
//        File finalDestination = new File(target);
//        // save the screenshot to the path given
//        try {
//            FileUtils.copyFile(source, finalDestination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return target;
//    }
}

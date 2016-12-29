package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

/**
 * Created by deepak on 8/22/2016.
 */
public class BaseTest {
    public static WebDriver driver;
    static Logger logger=Logger.getLogger(BaseTest.class);
    // String driverPath="C:\\Users\\deepak\\developer\\chromedriver\\chromedriver.exe";


    @BeforeClass
    public static void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver=new ChromeDriver();

        driver.get("http://newtours.demoaut.com");
        logger.info("Opening a newtour website.");
        driver.manage().window().maximize();


    }
    @AfterClass
    public static void afterClass(){
        driver.close();
        driver.quit();

        logger.info("Closing a browser.");
    }
}

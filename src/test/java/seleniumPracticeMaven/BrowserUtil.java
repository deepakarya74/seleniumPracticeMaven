package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by deepak on 8/25/2016.
 */
public class BrowserUtil {

    public static WebDriver driver;

    public static WebDriver returnBrowser(String browserName, String url) {

        if (browserName.equalsIgnoreCase("Firefox")) {

            driver = new FirefoxDriver();
            driver.get(url);
        } else if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);

        }
            driver.manage().window().maximize();

            return driver;
        }

    }

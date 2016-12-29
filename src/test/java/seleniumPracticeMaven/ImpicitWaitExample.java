package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by deepak on 8/23/2016.
 */
public class ImpicitWaitExample {

    public static void main(String Args[]){

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedTitle="Meet Guru99";
        String actualTitle="";
        String url="http://www.guru99.com/";
        driver.get(url);
        driver.manage().window().maximize();
        actualTitle=driver.getTitle();
        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test case passed successfully.");
        }
        else{
            System.out.println("Test case Failed.");
        }
        driver.close();
        driver.quit();

        }
}

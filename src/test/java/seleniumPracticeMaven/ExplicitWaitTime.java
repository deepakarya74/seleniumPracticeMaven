package seleniumPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by deepak on 8/23/2016.
 */
public class ExplicitWaitTime {

    public static void main(String Args[]){
        String url="http://www.guru99.com/";
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver() ;
        WebDriverWait webDriverWait= new WebDriverWait(driver,20);
        String expectedTitle="Meet Guru99";
        String actualTitle="";
        driver.get(url);
        driver.manage().window().maximize();
        actualTitle=driver.getTitle();
        if(actualTitle.contentEquals(expectedTitle)){

            System.out.println("Test Case Passed Successfully");

        }else
        {
            System.out.println("Test Case failed.");
        }
        WebElement guru99seleniumlink;
        guru99seleniumlink= webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='java_technologies']/li[3]/a")));
        guru99seleniumlink.click();


    }
}

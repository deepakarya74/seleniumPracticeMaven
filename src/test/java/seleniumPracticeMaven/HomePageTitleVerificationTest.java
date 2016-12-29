package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by deepak on 8/23/2016.
 */
public class HomePageTitleVerificationTest {

    public static void main(String Args[]) {
        String url="http://newtours.demoaut.com";
        String expectedTitle="Welcome: Mercury Tours";
        String actualTitle="";
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        actualTitle=driver.getTitle();

      if( actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test case passed successfully" );
      }
        else
      {
          System.out.println("Test case failed" );
      }
        driver.close();
        driver.quit();

    }
}
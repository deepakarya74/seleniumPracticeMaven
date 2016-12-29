package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by deepak on 8/25/2016.
 */
public class pageFactoryTest {

    @Test
    public void verifySearch(){
        String url="http://www.google.com";
        // BrowserUtil browserUtil =new BrowserUtil();
        //Open a chrome browser.
        WebDriver driver= BrowserUtil.returnBrowser("chrome",url);
        //Instantiate the GoogleHomePageObject
        GoogleHomePageObject googleHomePageObject=  PageFactory.initElements(driver,GoogleHomePageObject.class);
        //Instantiate the SeleniumWebPage
        SeleniumPageWebsite seleniumPageWebsite=PageFactory.initElements(driver,SeleniumPageWebsite.class);

        //Search the selenium word.
        googleHomePageObject.searchText("Selenium");
        //Click the selenium link.
        googleHomePageObject.clickSeleniumLink();



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Click the download Link.
        seleniumPageWebsite.clickDownloadLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Click the Previous Link
        seleniumPageWebsite.clickPreviousLink();
        System.out.println("Test Case Completed Successfully");


    }
}

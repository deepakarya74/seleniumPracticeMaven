package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by deepak on 8/24/2016.
 */
public class SeleniumPageWebsite {

    WebDriver driver;

    public SeleniumPageWebsite(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(linkText = "Download")
    WebElement downloadLink;

    @FindBy(linkText="Previous Releases")
    WebElement previousLink;

    public SeleniumPageWebsite() {

    }

    public void clickDownloadLink()  {


        downloadLink.click();
        System.out.println("Click Download successfully");


    }

    public void clickPreviousLink(){
        previousLink.click();
        System.out.println("Click Previous link successfully");
    }
}

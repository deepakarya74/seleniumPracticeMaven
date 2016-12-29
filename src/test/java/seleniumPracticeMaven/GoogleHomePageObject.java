package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by deepak on 8/24/2016.
 */
public class GoogleHomePageObject {

    WebDriver driver;

    //Initialize the page object in the page itself
    public GoogleHomePageObject(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name="btnG")
    WebElement googleSearchButton;

    @FindBy(linkText = "Selenium - Web Browser Automation")
    WebElement seleniumLink;
    //http://www.seleniumhq.org/

    public void searchText(String searchText){


        searchBox.sendKeys(searchText);

        googleSearchButton.click();



    }



    public void clickSeleniumLink(){

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        seleniumLink.click();
        System.out.println("Clicked the Selenium Link");

    }



}

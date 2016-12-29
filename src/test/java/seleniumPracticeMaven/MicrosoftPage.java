package seleniumPracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by deepak on 8/26/2016.
 */
public class MicrosoftPage {

    WebDriver driver;

    public MicrosoftPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(linkText = "Technologies")
    WebElement lnkTechnology;




    public void clickTechnologyLink(){
        lnkTechnology.click();
    }



    public void getListTechDropDown(){
//Xpath=//*[@id='java_technologies']/child::li[1]
        ////*[@id='drawer']/div/nav/ul/li[1]/ul/li[1]/a

        System.out.println("Dropdown ");
        for(int i=0;i<=5;i++){

            Actions action=new Actions(driver) ;
            action.moveToElement(driver.findElement(By.cssSelector("a[href*='/app-development-msdn']"))).build().perform();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            action.click();
        }


        //List<WebElement> techDropDownList= driver.findElements(By.cssSelector(""));


                System.out.println("Step2 ");

        }
    }



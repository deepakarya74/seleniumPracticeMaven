package seleniumPracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by deepak on 8/26/2016.
 */
public class dropDownTest {
    String url="https://msdn.microsoft.com/en-us/default.aspx";

    WebDriver driver=BrowserUtil.returnBrowser("Chrome",url);
    MicrosoftPage microsoftPage= PageFactory.initElements(driver,MicrosoftPage.class);



    @Test
    public void testClick(){

        microsoftPage.clickTechnologyLink();
        microsoftPage.getListTechDropDown();

    }

}

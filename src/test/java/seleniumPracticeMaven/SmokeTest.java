package seleniumPracticeMaven;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


/**
 * Created by deepak on 8/22/2016.
 */
public class SmokeTest extends BaseTest{
static Logger logger= Logger.getLogger(SmokeTest.class);

@Test
    public static void verifyHomePage(){
    HomePage homePage=new HomePage();
    String expectedTitle="Welcome: Mercury Tours";
    String actualTitle= homePage.verifyTitle(driver.getTitle());
    logger.info("Opening a homePage.");

    Assert.assertEquals(expectedTitle,actualTitle);
    logger.info("Test case created");

}
}

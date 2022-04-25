package am.karas.TestScripts;

import am.karas.Pages.ChooseDeliveryCenter;
import am.karas.Pages.ClickOffers;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.ScreenshotMethod;

import java.io.IOException;

public class VerifyOffersTest extends Base
{
    @Test
    public void verifyOffer() throws IOException
    {
        try
        {
            ChooseDeliveryCenter cdc = new ChooseDeliveryCenter(driver);
            ClickOffers co = new ClickOffers(driver);

            cdc.selectDeliveryCenter();

            co.selectOffers();
            String actualText = co.specialOffersText();
            String expectedText = "Special Offers";
            Assert.assertEquals(actualText, expectedText);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult testResult) throws IOException
    {
        if(testResult.getStatus() == ITestResult.FAILURE)
        {
            ScreenshotMethod.takeScreenshot("D:\\QATesting\\FailedTestingScreenshots", driver, "screenshot");
        }
    }
}

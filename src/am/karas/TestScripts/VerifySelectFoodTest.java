package am.karas.TestScripts;

import am.karas.Pages.ChooseDeliveryCenter;
import am.karas.Pages.SearchFood;
import am.karas.Pages.SelectFood;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySelectFoodTest extends Base
{
    @Test
    public void verifySelectFood()
    {
        ChooseDeliveryCenter cdc = new ChooseDeliveryCenter(driver);
        SearchFood sf = new SearchFood(driver);
        SelectFood slf = new SelectFood(driver);

        cdc.selectDeliveryCenter();
        cdc.isLoginButtonExist();
        sf.searchFood("pizza");

        String actualText = sf.getConfirmationText();
        String expectedText = "pizza";

        Assert.assertEquals(actualText, expectedText);

        slf.addFoodToFoodcart();
    }
}

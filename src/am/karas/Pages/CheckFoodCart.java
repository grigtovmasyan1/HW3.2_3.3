package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckFoodCart
{
    @FindBy(css="body > div.container-main.home-page > header > div > div.header-right > div > a:nth-child(3) > i")
    private WebElement clickFoodCartIcon;
    @FindBy(css="body > div.container-main.home-page > div > div.padding.checkout-cont.ng-scope > div:nth-child(4) > div > div:nth-child(1) > div.col-md-10 > table > thead > tr > th:nth-child(1)")
    private WebElement itemNameText;
    public CheckFoodCart(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void clickFoodCart()
    {
        clickFoodCartIcon.click();
    }
    public boolean isOrderExist()
    {
        return itemNameText.isDisplayed();
    }
}

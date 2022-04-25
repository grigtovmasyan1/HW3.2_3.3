package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseDeliveryCenter
{
    @FindBy(id="Yerevan")
    private WebElement deliverycenter;

    @FindBy(css="body > div.container-main.home-page > header > div > div.header-right > div > a.login.categories-button-shopping-cart > div > button")
    private WebElement loginButton;
    public ChooseDeliveryCenter(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void selectDeliveryCenter()
    {
        deliverycenter.click();
    }
    public boolean isLoginButtonExist()
    {
        return loginButton.isDisplayed();
    }
}

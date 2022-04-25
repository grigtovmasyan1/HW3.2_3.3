package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOffers
{
    @FindBy(css=".moreSpecialOffer > a:nth-child(1)")
    private WebElement offersButton;
    @FindBy(css=".header-inner > span:nth-child(1)")
    private WebElement specialOffersText;
    public ClickOffers(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void selectOffers()
    {
        offersButton.click();
    }
    public String specialOffersText()
    {
        return specialOffersText.getText();
    }
}

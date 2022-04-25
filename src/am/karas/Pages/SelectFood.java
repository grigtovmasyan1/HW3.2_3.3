package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFood
{
    @FindBy(css="#\\31 8062502570002nep0-cm > div > a > div > img")
    private WebElement clickFoodImage;
    @FindBy(id="addButton")
    private WebElement clickAdd;
    public SelectFood(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void addFoodToFoodcart()
    {
        clickFoodImage.click();
        clickAdd.click();
    }
}

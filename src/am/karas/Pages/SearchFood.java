package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFood
{
    @FindBy(css="#header_search > i")
    private WebElement searchIcon;
    @FindBy(name="search")
    private WebElement food;
    @FindBy(css="body > div.container-main.home-page > div > div > div.desktop-single-product-header > div")
    private WebElement confirmationText;

    public SearchFood(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void searchFood(String foodname)
    {
        searchIcon.click();
        food.sendKeys(foodname);
        food.submit();
    }
    public String getConfirmationText()
    {
        return confirmationText.getText();
    }
}

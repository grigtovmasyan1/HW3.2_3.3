package am.karas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ClickHotDishes
{
    @FindBy(css="div.singleMenu:nth-child(3) > div:nth-child(1) > a:nth-child(1) > span:nth-child(2)")
    private WebElement hotDishesButton;
    @FindBy(css=".header-inner > span:nth-child(1)")
    private WebElement hotDishesText;
    public ClickHotDishes(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void selectHotDishes()
    {
        hotDishesButton.click();
    }
    public String hotDishesText()
    {
        return hotDishesText.getText();
    }
}

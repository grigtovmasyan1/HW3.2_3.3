package am.karas.TestScripts;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Base
{
    RemoteWebDriver driver;

    @BeforeTest
    @Parameters("browserType")
    public void openApplication(String browserType) throws MalformedURLException
    {
        if(browserType.equals("chrome"))
        {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setAcceptInsecureCerts(true);
            chromeOptions.setCapability(CapabilityType.BROWSER_NAME,"chrome");
            driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), chromeOptions);
        }

        else if(browserType.equals("firefox"))
        {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setAcceptInsecureCerts(true);
            firefoxOptions.setCapability(CapabilityType.BROWSER_NAME,"firefox");
            driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), firefoxOptions);
        }

        driver.get("https://karas.am/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterTest
    public void closeApplication()
    {
        driver.quit();
    }
}

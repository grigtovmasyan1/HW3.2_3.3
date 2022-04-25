package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class ScreenshotMethod
{
    public static void takeScreenshot(String path, WebDriver driver, String scriptName) throws IOException
    {
        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(ss, new File(path+"\\"+scriptName+"_Screenshot"+(new Random().nextInt())+".jpg"));
    }
}

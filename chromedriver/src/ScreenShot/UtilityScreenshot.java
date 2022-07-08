package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityScreenshot {

	
	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver",".//good//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			//captureScreenShot(driver,"login.png");
			
		

	}
	public static void captureScreenShot(WebDriver driver,String ScreenShotName) throws IOException
	{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File sourse =scrShot.getScreenshotAs(OutputType.FILE);
      
        File Destination =new File("./Screenshot/facebook_login.png");
        FileHandler.copy(sourse, Destination);
        


	}

}

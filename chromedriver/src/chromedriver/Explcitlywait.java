package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explcitlywait {
	@Test
	public void waitSelinium(){
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebDriverWait waits = new WebDriverWait(driver,10);
		
		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up")))).click();
		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("firstname")))).sendKeys("kishor");
		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("lastname")))).sendKeys("Talele");
		
		
	}

}

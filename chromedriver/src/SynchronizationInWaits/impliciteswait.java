package SynchronizationInWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class impliciteswait {
	@Test
	public void waitselenium() {
		System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign Up")).click();

		driver.findElement(By.name("firstname")).sendKeys("kishor");

		driver.findElement(By.name("lastname")).sendKeys("Talele");

		driver.findElement(By.name("reg_email__")).sendKeys("kishortalele95@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9960378525");
		
		
	}

}

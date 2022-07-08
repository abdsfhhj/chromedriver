package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class waitinselenium {
	@Test
	

	public void waitInselenium() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();
       
		
		driver.findElement(By.name("firstname")).sendKeys("kishor");
		 Thread.sleep(1000);
		 driver.findElement(By.name("lastname")).sendKeys("Talele");
		 Thread.sleep(1000);
		 driver.findElement(By.name("reg_email__")).sendKeys("kishottalele95@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.name("reg_passwd__")).sendKeys("9960378525");
		 Thread.sleep(1000);
	}

}

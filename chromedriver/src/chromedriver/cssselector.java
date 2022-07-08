package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
			driver.findElement(By.cssSelector(".button")).click();

	}

}

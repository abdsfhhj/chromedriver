package chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownutility {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dob = driver.findElement(By.name("birthday_day"));
		WebElement dom = driver.findElement(By.name("birthday_month"));
		WebElement doy = driver.findElement(By.name("birthday_year"));
		
	
		

	}

}

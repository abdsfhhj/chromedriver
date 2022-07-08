package chromeDriver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chromedriver\\driver\\chromedriver.exe ");

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.close();
		driver.navigate().back();
		//driver.quit();
		
		


	}

}

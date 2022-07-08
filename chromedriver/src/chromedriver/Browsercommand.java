package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String pTitle =driver.getTitle();
		System.out.println(pTitle);
		
		String crrUrl = driver.getCurrentUrl();
		System.out.println(crrUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
				

	}

}

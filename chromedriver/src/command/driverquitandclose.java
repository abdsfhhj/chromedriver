package command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverquitandclose {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//good//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.get("https://www.facebook.com/");
		String ptitle=driver.getTitle();
		// print the title in the eclipse console
		System.out.println(ptitle );
		//get the current page URL
		String CuurUrl =driver.getCurrentUrl();
		// printing the URL in the console
		System.out.println(CuurUrl);
		//driver.quit();
		String pagesource = driver.getPageSource();
		System.out.println( pagesource);
	}

}

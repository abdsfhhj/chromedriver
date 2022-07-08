package chromedriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
        //driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        //driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        //driver.findElement(By.name("Submit")).click();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		
		//driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//driver.findElement(By.partialLinkText("Log In")).click();
		
	//	WebElement language = driver.findElement(By.partialLinkText("UK"));language.click();
		
		//List<WebElement> List_a = driver.findElements(By.tagName("a"));
		
		// int totalLink = List_a.size();
		// System.out.println("Total Num of Links On Facebook login page are : "+ totalLink);
		
	
		
		
		// List elm =  driver.findElements(By.tagName("input"));
		   // int total = elm.size();
		   // System.out.println("Total webelement starting with tagname'input' = "+ total);
		   // Thread.sleep(500);
		 
		
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".button")).click();
	}
}


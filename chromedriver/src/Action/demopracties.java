package Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demopracties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./good/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		WebElement js_alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement js_Confirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement js_prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
			js_alert.click();
		
		Alert alert = driver.switchTo().alert();
		
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(result.getText());
		
		js_Confirm.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		js_prompt.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hi ALl, welcome to prompt");
		
		alert.accept();
		
		//alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		//driver.close();
		       
		}
		
	         
	         
}

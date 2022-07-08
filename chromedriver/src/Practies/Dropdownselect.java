package Practies;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Dropdownselect {

	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./good/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println("Sign up page:" +driver.getTitle());
		
		driver.findElement(By.linkText("English (UK)")).click();
		System.out.println("English Up:" +driver.getTitle());
			 
	     driver.navigate().back();
	     System.out.println(driver.getTitle());

	    // Thread.sleep(5000);
	    // driver.navigate().forward();
	    // System.out.println(driver.getTitle());

	    // Thread.sleep(5000);
	    // driver.navigate().refresh();
	    // System.out.println(driver.getTitle());

		
		
		   	
		  
	}

}

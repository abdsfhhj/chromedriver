package chromedriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
	   System.setProperty("webDriver.gecko.driver", "./driver/geckodriver2.exe");
	   FirefoxDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	}

}

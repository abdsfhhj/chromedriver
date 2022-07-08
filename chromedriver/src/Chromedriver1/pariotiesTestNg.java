package Chromedriver1;

import org.testng.annotations.Test;

public class pariotiesTestNg {
	@Test(priority  =1)
	public void loginTest()
	{
		System.out.println("LoginTest()");
	}
	
	@Test(priority =2)
	public void CreateAccountTest()
	{
		System.out.println("CreateAccountTest()");
	}
	
	@Test(priority =3)
	public void UpdateAccountTest()
	{
		System.out.println("UpdateAccountTest()");
	}
	
	@Test(priority =4)
	public void LogoutTest()
	{
		System.out.println("LogoutTest()");
	}

}

package TestNgAnnotation;

import org.testng.annotations.Test;

public class DependsOnTestNg {
	@Test()
	public void loginTest()
	{
		System.out.println("LoginTest()");
	}
	
	@Test(dependsOnMethods ={"loginTest"})
	public void CreateAccountTest()
	{
		System.out.println("CreateAccountTest()");
	}
	
	
	
	@Test(dependsOnMethods ={"loginTest","CreateAccountTest"})
	public void LogoutTest()
	{
		System.out.println("LogoutTest()");
	}

}

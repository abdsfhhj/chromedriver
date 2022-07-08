package TestNgAnnotation;

import org.testng.annotations.Test;

public class pariotiesTestNg {
	@Test()
	public void test()
	{
		System.out.println("Test()");
	}
	@Test(priority  =1)
	public void loginTest()
	{
		System.out.println("LoginTest()");
	}
	
	
}

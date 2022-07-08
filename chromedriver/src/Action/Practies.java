package Action;

import org.testng.annotations.Test;

public class Practies {
	@Test()
	public void LoginTest()
	{
		System.out.println("LoginTest");
	}
	@Test(dependsOnMethods= {"LoginTest"})
	public void CreatedAccount()
	{
		System.out.println("CreatedAccount");
	}
	
	@Test(dependsOnMethods= {"LoginTest","CreatedAccount"})
	public void LogoutTest()
	{
		System.out.println("LogoutTest");
	}
}

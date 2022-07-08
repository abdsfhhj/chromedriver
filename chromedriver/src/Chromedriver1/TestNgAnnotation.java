package Chromedriver1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	
   @Test
	public void test()
	{
		System.out.println("test() method");
	}
   
   @AfterMethod()
   public void afterMethod()
   {
	   System.out.println("Aftermethod()");
   }
   
   @AfterClass()
   public void afterclass()
   {
	   System.out.println("Afterclass()");
   }
	
   @AfterTest()
   public void aftertest()
   {
	   System.out.println("Aftertest()");
   }
   @AfterSuite()
   public void aftersuit()
   {
	   System.out.println("Aftersuite()");
   }
   
  @Test
  public void test1()
  {
	  System.out.println("test1()");
  }
     
     @BeforeMethod()
     public void beforeMethod()
     {
  	   System.out.println("beforeMethod()");
     }
     
     @BeforeClass()
     public void beforeclass()
     {
  	   System.out.println("beforeclass()");
     }
  	
     @BeforeTest()
     public void beforetest()
     {
  	   System.out.println("beforetest()");
     }
     @BeforeSuite()
     public void beforesuit()
     {
  	   System.out.println("beforesuit()");
     }
     

  
	
}

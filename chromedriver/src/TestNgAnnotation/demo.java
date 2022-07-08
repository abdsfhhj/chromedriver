package TestNgAnnotation;

import org.testng.annotations.Test;

public class demo {

	public static void main(String[] args) {
		@Test()
		public void test()
		{
			System.out.println("test");
		}

		@Test(priority=1)
		public void test1()
		{
			System.out.println("test1");
		}
	}

}

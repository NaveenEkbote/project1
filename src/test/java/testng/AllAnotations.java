package testng;

import org.testng.annotations.*;

public class AllAnotations {

	@Test(enabled=false)
	void testCase1()
	{
		System.out.println("Inside test case 1");
	}
	@Test()
	void testCase2()
	{
		System.out.println("Inside the test case 2");
	}
	@BeforeSuite()
	void beforeSuite()
	{
		System.out.println("Inside the before suite");
	}
	@AfterSuite()
	void afterSuite()
	{
		System.out.println("Inside the After Suite");
	}
	@BeforeTest()
	void beforeTest()
	{
		System.out.println("Inside the before test");
	}
	@AfterTest()
	void afterTest()
	{
		System.out.println("Inside the after test");
	}
	@BeforeClass()
	void beforeClass()
	{
		System.out.println("Inside the before class");
	}
	@AfterClass()
	void afterClass()
	{
		System.out.println("Inside the after class");
	}
	@BeforeMethod()
	void beforeMethod()
	{
		System.out.println("Inside the before method");
	}
	@AfterMethod()
	void afterMethod()
	{
		System.out.println("Inside the after method");
	}
}

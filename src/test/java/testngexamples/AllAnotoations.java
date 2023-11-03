package testngexamples;

import org.testng.annotations.*;

public class AllAnotoations {

	@BeforeSuite()
	void m1()
	{
		System.out.println("Inside Beofer suite");
	}
	@AfterSuite()
	void m2()
	{
		System.out.println("Inside After suite");

	}
	@BeforeTest()
	void m3()
	{
		System.out.println("Inside Beofer test");

	}
	@AfterTest()
	void m4()
	{
		System.out.println("Inside After test");

	}
	@BeforeClass()
	void m5()
	{
		System.out.println("Inside Beofer class");

	}
	@AfterClass()
	void m6()
	{
		System.out.println("Inside After class");
	}
	@BeforeGroups()
	void m7()
	{
		System.out.println("Inside Beofer groups");

	}
	@AfterGroups()
	void m8()
	{
		System.out.println("Inside After group");
	}
	@BeforeMethod()
	void m9()
	{
		System.out.println("Inside Beofer method");
	}
	@AfterMethod()
	void m10()
	{
		System.out.println("Inside After method");
	}
	@Test()
	void testCase2()
	{
		System.out.println("Inside test case 2");
	}
	@Test()
	void testCase1()
	{
		System.out.println("Inside test case 1");
	}

}

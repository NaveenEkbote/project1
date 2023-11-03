package tstng;

import org.testng.annotations.*;

public class Annotations {

	
	@BeforeSuite()
	void M2()
	{
		System.out.println("Before suite Method2 code");
	}
	@AfterSuite()
	void M1()
	{
		System.out.println("After suite Method1 code");
	}
	@BeforeTest()
	void M5()
	{
		System.out.println("beforetest Method5 code");
	}
	@AfterTest()
	void M9()
	{
		System.out.println("aftertest Method9 code");
	}
	@Test()
	void testcase1()
	{
		System.out.println("testcase 1 code");
	}
	@Test()
	void testcase2()
	{
		System.out.println("testcase 2 code");
	}
	@BeforeMethod()
	void M8()
	{
		System.out.println("Beforetest Method 8 code");
	}
	@AfterMethod()
	void M22()
	{
		System.out.println("Aftertest Method 22 code");
	}
}

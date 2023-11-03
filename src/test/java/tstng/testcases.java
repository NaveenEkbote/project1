package tstng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases {

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

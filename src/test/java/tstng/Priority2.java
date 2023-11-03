package tstng;

import org.testng.annotations.*;

public class Priority2 {

	@Test(enabled=false)
	void M5()
	{
		System.out.println("M5 code ");
	}
	@Test()
	void M6()
	{
		System.out.println("M6 code ");
	}
	@Test(priority=3)
	void M7()
	{
		System.out.println("M7 code ");
	}
}

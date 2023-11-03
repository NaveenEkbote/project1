package tstng;

import org.testng.annotations.*;

public class Priority {

	@Test(priority=2)
	void M5()
	{
		System.out.println("M5 code ");
	}
	@Test(priority=1)
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

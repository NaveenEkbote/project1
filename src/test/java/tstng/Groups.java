package tstng;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups="Regression",priority=2)
	void M1()
	{
		System.out.println("regression code");
	}
	@Test(groups="Smoke",priority=1)
	void M2()
	{
		System.out.println("smoke code");
	}
	@Test(groups="Regression and Smoke")
	void M9()
	{
		System.out.println("Regression and Smoke code");
	}
	@Test(enabled=false)
	void M12()
	{
		System.out.println("M12 code");
	}
}

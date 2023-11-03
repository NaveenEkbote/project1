package tstng;

import org.testng.annotations.*;

public class Dependsonmethod {

	@Test(dependsOnMethods= {"openbrowser"})
	void Signin()
	{
		System.out.println("Signin code");
	}
	@Test()
	void openbrowser()
	{
		System.out.println("registration code");
	}
	@Test(dependsOnMethods= {"Signin"})
	void logout()
	{
		System.out.println("logout code");
	}
}

package testngexamples;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	void sendEmail()
	{
		System.out.println("Code to send an email");
	}
	@Test(priority=0)
	void registerAccount()
	{
		System.out.println("Code to register an account");
	}
	@Test(enabled=false)
	void login()
	{
		System.out.println("Code to login to application");
	}
}

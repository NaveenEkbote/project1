package testng;

import org.testng.annotations.Test;

public class Priorities {
	@Test(priority=2)
	void login()
	{
		System.out.println("Login code");
	}
	@Test(priority=1)
	void registerAccount()
	{
		System.out.println("Register account code");
	}
	@Test(priority=3)
	void sendEmail()
	{
		System.out.println("Send email code");
	}

}

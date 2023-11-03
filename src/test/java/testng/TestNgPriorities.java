package testng;

import org.testng.annotations.Test;

public class TestNgPriorities {
	@Test(priority=1)
	void login()
	{
		System.out.println("Inside Login");
	}
	@Test(priority=0)
	void registerAnAccount()
	{
		System.out.println("Inside Register account");
	}
	@Test(priority=2)
	void sendAnEmail()
	{
		System.out.println("Inside send email");
	}

}

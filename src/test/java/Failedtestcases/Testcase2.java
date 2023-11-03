package Failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {
		@Test()
		public void failedtestcase1()
		{
			Assert.assertTrue(false);
			System.out.println("i am not working in the office");
		}
	}

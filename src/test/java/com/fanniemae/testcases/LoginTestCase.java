package com.fanniemae.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;

public class LoginTestCase extends TestBase {

	@Test (enabled=true)
	public void tc_Login () {
		System.out.println("Test case 1");
		
		click ("id_LoginBtn");
		type ("xpath_user", "matt@aol.com");
		type ("id_Pwd", "Pass123!");
		click ("id_BottomLoginbutton");
		Assert.assertEquals("Welcome back!", super.getText("id_SuccessLogin"));
		
	}
}

	

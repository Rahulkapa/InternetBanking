package com.inetBankingV1.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageobject.loginPage;

public class TC_loginPageTest_001 extends BaseClass {

	@Test
	public void guru99loginpageTest() {
		
		loginPage lp = new loginPage(driver);
		lp.setGuru99logpagepassword(password);
		//logger.info("enter password");
		lp.setGuru99logpageusername(username);
		//logger.info("enter username");
		lp.clickGuru99logpageloginbutton();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			//logger.info("login test passed");
		}else {
			Assert.assertTrue(false);
			//logger.info("login test failed");
		}
		
		
		
		
	}
	
	
}

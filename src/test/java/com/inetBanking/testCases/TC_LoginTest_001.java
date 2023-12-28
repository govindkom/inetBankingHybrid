package com.inetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseUrl);

		//logger.info("url is opened");
		LoginPage lp= new LoginPage(driver);
		
		lp.setUsername(username);
		//logger.info("username entered");
		
		lp.setPassword(password);
		//logger.info("password entered");
		
		
		lp.clickOnLogin();
		//logger.info("clicked on login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			//logger.info("login test passed");
		}
		else
		{
			Assert.assertTrue(false);
		//logger.info("login tets failed");
		}
	
	
	}
}

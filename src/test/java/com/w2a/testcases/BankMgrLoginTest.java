package com.w2a.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankMgrLoginTest extends TestBase{

	@Test
	public void loginAsBankManager() throws InterruptedException, IOException {
		
		verifyEquals("abc", "xyz");
		
		click("bmlBtn_CSS");
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("addCustBtn_CSS"))),"Login not successful");
	}
}

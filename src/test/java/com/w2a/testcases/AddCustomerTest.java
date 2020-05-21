package com.w2a.testcases;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	//@Test(dataProvider="getData")
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void addCustomerTest(String first,String last,String post,String alertText) throws InterruptedException {
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(or.getProperty("addCustBtn_CSS")))));
		
		click("addCustBtn_CSS");
		type("firstname_CSS",first);
		type("lastname_CSS",last);
		type("postcode_CSS",post);
		click("addBtn_CSS");
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alertText));
		Thread.sleep(3000);
		
		alert.accept();
		
		
		
	}
	
	
}

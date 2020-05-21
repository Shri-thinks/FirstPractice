package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class RegistrationTest extends TestBase{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void registrationTest(String username,String password,String desc) {
		
		driver.get(config.getProperty("practiceURL"));
		
		type("user_CSS",username);
		type("pwd_CSS",password);
		type("desc_CSS",desc);
		
		
	}
}

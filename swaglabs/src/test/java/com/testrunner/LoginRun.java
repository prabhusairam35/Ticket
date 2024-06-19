package com.testrunner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectrepository.LoginPage;

public class LoginRun extends LoginPage {

	@BeforeMethod
	public void logintest() {
		browserlaunch();
		passurl(pro.getProperty("url"));
	}
	
	@Test
	public void lt() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.enterusername(pro.getProperty("username"));
		lp.enterpassword(pro.getProperty("password"));
		lp.clickloginbtn();
		Thread.sleep(3000);
		close();
	
	}
}

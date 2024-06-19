package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testutility.DriverHelper;

public class LoginPage extends DriverHelper {

	@FindBy(id="user-name")private WebElement usernamefield;
	@FindBy(id="password")private WebElement passwordfield;
	@FindBy(id="login-button")private WebElement loginbtnfield;
	
	public void enterusername(String data) {
		type(usernamefield, data);
	}
		
	public void enterpassword(String password) {
		type(passwordfield, password);
		}	
	
	public void clickloginbtn() {
	click(loginbtnfield);
	}
		
	
	public void login() {
		enterusername(pro.getProperty("username"));
		enterpassword(pro.getProperty("password"));
		clickloginbtn();
	}
	
}

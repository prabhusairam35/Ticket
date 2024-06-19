package com.testutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.testbase.BaseClass;

public class DriverHelper extends BaseClass{
	
	
	public static void browserlaunch() {
		driver=new ChromeDriver();
	}

	public static void passurl(String url) {
		driver.get(url);
		}

	public static void type(WebElement ele,  String senddata) {
		ele.sendKeys(senddata);
		}
	
	public static void click(WebElement ele) {
		Actions act=new Actions(driver);
		act.click(ele).perform();
	}
	
	public void close() {
		driver.close();
	}
}

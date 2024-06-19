package com.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

protected static WebDriver driver;
protected static	Properties pro;

public BaseClass() {
	PageFactory.initElements(driver, this);
try
{	
	pro =new Properties();
	File file=new File("C:\\Users\\welcome\\eclipse-workspace\\swaglabs\\src\\main\\resources\\config.properties");
FileInputStream fis=new FileInputStream(file);
pro.load(fis);
}
catch(FileNotFoundException e) {
	e.getMessage();
}
catch(IOException e) {
	e.getMessage();
}	

}

}

package com.functionaltest.SeleniumFunctionaltest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FunctionalTest1 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.edureka.co/");
	driver.manage().window().maximize();
	
	String x =driver.getTitle();
	System.out.println("Title is" + x);
	
	String y = driver.getCurrentUrl();
	System.out.println("Url is" +y);
	}
	
	
	
	
	{
		
	
	
	
	}
}

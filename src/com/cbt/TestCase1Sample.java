package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Sample {
public static void main(String[] args) {
	
	
//	 1. Open Chrome
	///Users/mustakilali/Documents/Selenium Dependencies/drivers
	System.setProperty("webdriver.chrome.driver", "/Users/mustakilali/Documents/Selenium Dependencies/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
//  2. Go to url google.com 
	driver.get("http://google.com");
 //  3. verify title 
 //		Expected: Google 
	String expected = "Google";
	String actual = driver.getTitle();
//	System.out.println(actual);
	if (actual.equalsIgnoreCase(expected)) 
		System.out.println("Pass");
		else 
			System.out.println("Fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		
	}
	 
}


package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2Sample {

	public static void main(String[] args) throws InterruptedException {
		//1. Open Chrome 
		System.setProperty("webdriver.chrome.driver", "/Users/mustakilali/Documents/Selenium Dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Go to url www.cybertekschool.com
		driver.get("http://www.cybertekschool.com"); 
//	    http:// is ALWAYS REQUIRED. 
//		2. driver.navigate().to("www.cybertekschool");
	 // 3. There are two ways to navigate to url --> navigate method is rarely used. 
		//Verify url contains 
			//Expected: CybertekSchool 
	
		String expected = "cybertekschool";
		String actual = driver.getCurrentUrl();
		
		if( actual.contains(expected)) {
			System.out.println("PASS BRUH");
		} else {
			System.out.println("NOT PASS BRUH");
			System.out.println("Expected:\t"+ expected);
			System.out.println("Actual:\t" + actual);
			//\t is for space
		}
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		// goes back to previous page
		driver.navigate().forward();
		Thread.sleep(1000);
		// goes forward in browsing history
		driver.navigate().refresh();
	    // refreshes the current page 
		
		
	}

}

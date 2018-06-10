package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWwebsite {

	public static void main(String[] args)  {

/*Basic Authentication
 * 1. Open chrome 
 * 2. Go to url http://newtours.demoaut.com
 * 3. enter username "tutorial" 
 * 4. enter password "tutorial"
 * 5. click on sign in button
 * verifiy title contains 
 * 	Expected: Find a Flight
 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/mustakilali/Documents/Selenium Dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com"); 
		
		//findElement ---> finds element on a page 
		//By.name(userName") ---> how to find it
		//sendKeys() ---> types an element 
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		//click() --> clicks 
		driver.findElement(By.name("login")).click();
		
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		if (actual.contains(expected)) 
			System.out.println("Pass");
			else 
				System.out.println("Fail");
				System.out.println("Expected:\t" + expected);
				System.out.println("Actual:\t" + actual);
		
		
	}
	

}

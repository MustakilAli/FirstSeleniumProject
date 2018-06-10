package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWwebsite2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mustakilali/Documents/Selenium Dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://testing-ground.scraping.pro/login"); 
		
		//findElement ---> finds element on a page 
		//By.name(userName") ---> how to find it
		//sendKeys() ---> types an element 
		
		driver.findElement(By.name("usr")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		//click() --> clicks 
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//by inspecting the website
		
		String expected = "welcome";
		String actual = driver.getTitle();
		if (actual.contains(expected)) 
			System.out.println("Pass");
//			else 
//				System.out.println("Fail");
//				System.out.println("Expected:\t" + expected);
//				System.out.println("Actual:\t" + actual);
		
		
	}
		
	}



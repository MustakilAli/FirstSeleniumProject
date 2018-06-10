package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mustakilali/Documents/Selenium Dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.amazon.com"); 
		Thread.sleep(2000);
		
		//driver.close();
		//Only closes the current program that you run when you click the run button. 
		driver.quit();
		//Closes all the tabs/windows 
	}

}




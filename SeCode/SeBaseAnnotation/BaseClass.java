/**
 * @author gaurnitai
 * @created_date Apr 3, 2018
 */
package com.selenium.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		System.out.println(driver);
		return driver;
		
	}
	

	@BeforeClass
	public void setDriver() {		
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Launching url for make my trip....");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}



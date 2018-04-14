package com.selenium.dropdownwindowsframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	// Iframe are like a separate container on the website which basically holds their content independent of parentFrame
	// An IFrame (Inline Frame) is an HTML document embedded inside another HTML document on a website
	// The IFrame HTML element is often used to insert content from another source,such as an advertisement, into a Web page.
	// IFrame's content can be changed or refreshed without requiring the user to reload the parent frame (website)
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:56085/seleniumTest2.html");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		// There are 3 ways to get the Iframe on any website using Selenium Webdriver
		//driver.switchTo().frame(int args)
		//driver.switchTo().frame(String args)
		//driver.switchTo().frame(WebElement args)
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		driver.switchTo().frame("hubspot_frame");
		driver.findElement(By.className("hsg-nav__burger-wrapper")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("hsg-nav__groups-close")).click();
		
		//driver.switchTo().parentFrame(); // if we dont switch back to parentwindow we will get error while executing further code
		
		driver.switchTo().defaultContent(); // we can use either this or parentFrame().
		
		driver.switchTo().frame(3);
		driver.findElement(By.className("hsg-nav__burger-wrapper")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("hsg-nav__groups-close")).click();
		
		jse.executeScript("window.scrollBy(500,0)","");
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		driver.switchTo().alert().accept();
		
		

	}

}

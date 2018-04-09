/**
 * @author gaurnitai
 * @created_date Oct 5, 2017
 */

package com.indigo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indigo.pagefactory.IndigoHomePagePageFactory;
//import com.indigo.objects.IndigoHomePage;
import com.indigo.utility.ScreenshotUtils;

public class IndigoHomePageTestCase {

	IndigoHomePagePageFactory ihp;
	WebDriver driver;
	//ScreenshotUtils su = new ScreenshotUtils(driver); // not possible to use here since we need to initialise driver
	  // first and then only we should pass So better initialise su in Before Test method
	ScreenshotUtils su;
	Actions a;
	
	
	@BeforeTest
	public void driverInit() {

		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		 driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		// IndigoHomePage ihp = new IndigoHomePage(driver);
		ihp = new IndigoHomePagePageFactory(driver);
		su = new ScreenshotUtils(driver);
		 a = new Actions(driver);
	}

	@Test
	public void bookFlightTextValidation() throws IOException {

		// Now lets make use of page objects to find elements
		
		ihp.bookFlight().click();
		
		String bookflight = ihp.bookFlight().getText();
		su.takeScreenshot("bookFlight");
		Assert.assertEquals(bookflight, "Book Flight");

	}
	
	@Test
	public void flightStatusTextValidation() throws IOException {

		// Now lets make use of page objects to find elements
		String flightSatus = ihp.flightStatus().getText();
		su.takeScreenshot("flightstatus");
		Assert.assertEquals(flightSatus, "Flight Status");

	}
	
	@Test
	public void viewBookingTextValidation() throws IOException {

		// Now lets make use of page objects to find elements
		String viewBooking = ihp.viewBooking().getText();
		su.takeScreenshot("viewbooking");
		Assert.assertEquals(viewBooking, "Flight Status");

	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		 driver.close();
	}
	

}

/**
 * @author gaurnitai
 * @created_date Mar 31, 2018
 */

package com.indigo.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.indigo.objects.FlightsMakeMyTripPage;
import com.indigo.utility.ScreenshotUtils;




public class FlightPageTestCase{

	FlightsMakeMyTripPage fmp;
	WebDriver driver;
	ScreenshotUtils su;

	@BeforeTest
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/gaurnitai/Documents/SeleniumJava/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fmp = new FlightsMakeMyTripPage(driver);
		su = new ScreenshotUtils(driver);

	}

	@Test
	public void pageTitleValidation() throws IOException {
		su.takeScreenshot("flightpage");
		String title = driver.getTitle();	
		// Assert.assertEquals("MakeMyTrip", title,"Thsis is not true");
	}

	@Test
	public void onewayFlightSearch() throws IOException {

		fmp.fromcity().click(); // sendkey in from text
		fmp.fromcity().sendKeys("Pune");
		fmp.fromcity().sendKeys(Keys.ENTER);
		fmp.tocity().sendKeys("Mumbai"); // sendkey in to textbox
		fmp.search().click(); // click on search
		su.takeScreenshot("flights");
	}

	@Test
	public void roundTripFlightSearch() {

		System.out.println("This is my 3rd test case");

	}

}

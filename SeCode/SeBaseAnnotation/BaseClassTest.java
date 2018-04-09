/**
 * @author gaurnitai
 * @created_date Apr 3, 2018
 */

package com.selenium.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTest extends BaseClass {

	WebDriver driver;
	/*
	@BeforeTest() // This will not work 
	public void setUp() {
		// BaseClass bc = new BaseClass(); // No need of creating object since we have
		// extends
		driver = getDriver();
	}*/

	@BeforeClass()
	public void setUp() {
		// BaseClass bc = new BaseClass(); // No need of creating object since we have
		// extends
		driver = getDriver();
	}

	@Test
	public void testCaseOne() {
		System.out.println(driver.getTitle());
		System.out.println("This is my first test case");
	}

	@Test
	public void testCaseTwo() {
		System.out.println(driver.getTitle());
		System.out.println("This is my second test case");
	}

}

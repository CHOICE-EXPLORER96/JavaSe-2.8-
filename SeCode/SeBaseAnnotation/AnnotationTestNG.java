/**
 * @author rajeshwar
 * @created_date Oct 2, 2017
 */

package com.selenium.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestNG {

	@BeforeTest
	public void initBrowser() {

		System.out.println("@BeforeTest - This method will run only once before all the test cases");
	}

	@BeforeMethod
	public void takeScreenshot() {
		System.out.println("@BeforeMethod - This method will run before each and every test case ie. @Test ");
	}

	@Test(groups = "Regression")
	public void loginWithValidData() {

		System.out.println(" @ Test - This method will run as a test cases or we can say it is a login Test Case");
	}

	@Test(groups = "Sanity")
	public void titleValidation() {

		System.out.println("@Test - This method will run as a test cases or It is a title validation test case");
	}

	@Test
	public void logOut() {

		System.out.println("@Test - This method will run as a test cases or it is a log out test case");

	}

	@AfterTest
	public void closeBrowser() {

		System.out.println("@AfterTest - This method will run only once after all the test cases");
	}

	@AfterMethod
	public void saveScreenshot() {
		System.out.println("@AfterMethod - This method will run after each and every test case ie. @Test ");
	}

}

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

// Annoations are the tag that are used to provide additional imformation to JVM or Compiler. In java it is always represenetd by @ 
// There are some commonly used annotations in Java 
// 1.@Override 2. SuppressWarning 3. Deprecated

// Similarly we have TestNG annotations 

/*Annotations are nothing but a piece of instruction for the compiler that you apply to classes, methods or variables in your Java code.
It is a powerful feature and an integral part of the TestNG framework. 
There are multiple TestNG annotations which you can use for different tasks. */

/*@Test - To represent method as test case . So each test case should have annotation @Test
@BeforeTest - Method with @BeforeTest runs only once before execution of all the Test Cases means @Test annoations
@AfterTest - Method with @AfterTest runs only once after execution of all the Test Cases means @Test annoations
@BeforeMethod - Method with @BeforeMethod Annotation will execute before each and every Test Case ie. @Test
@AfterMethod - Method with @BeforeMethod Annotation will execute after each and every Test Case ie. @Test
@BeforeClass - Method with @BeforeClass will run before each class 
@AfterClass - Method with @BeforeClass will run After each class 
*/
// The TestNG annotations extend the same concept and control the execution sequence of the test code and test methods.

/*There are many benefits of using the annotations in the project.

Its easy to implement and understand (dependsOnMethods , priority helpd to make it easy )
We can prioritize the test cases
We can create the dependency of test cases
We can pass data to the test cases
we can parameterize the Test Cases
You can group the test cases using the appropriate annotation.
You can do parallel testing.
You can pass extra parameters to annotations.*/

//*****************  This concept is very vital for Job interviews ******************

public class Annotations {
	
	@BeforeTest
	public void initBrowser() {
		
		System.out.println("@BeforeTest - This method will run only once before all the test cases");
	}
	
	
	
	@BeforeMethod
	public void takeScreenshot() {
		System.out.println("@BeforeMethod - This method will run before each and every test case ie. @Test "); 
	}
	
	
	@Test //(groups = "Regression")
	public void loginWithValidData() {
		
		System.out.println(" @ Test - This method will run as a test cases or we can say it is a login Test Case"); 
	}
	
	
	@Test //(groups = "Sanity")
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








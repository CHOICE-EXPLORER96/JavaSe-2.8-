/**
 * @author gaurnitai
 * @created_date Oct 5, 2017
 */

package com.indigo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndigoHomePage {

	// Here we are going to create Page Factory Model for Indigo website

	// this is the class for HomePage elements
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Book Flight']")
	WebElement abc;
	//By bookFlight = By.xpath("//a[text()='Book Flight']");
	@FindBy(xpath="//a[text()='Book Flight']")
	WebElement bookFlight;
	//By flightStatus = By.xpath("//ul[@class='center nav-hash']/li[2]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[2]")
	WebElement flightStatus;
	//By viewBooking = By.xpath("//ul[@class='center nav-hash']/li[3]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[3]")
	WebElement viewBooking;
	//By updateContactdetails = By.xpath("//ul[@class='center nav-hash']/li[4]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[4]")
	WebElement updateContactdetails;
	//By checkin = By.xpath("//ul[@class='center nav-hash']/li[5]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[5]")
	WebElement checkin;
	//By viewGST = By.xpath("//ul[@class='center nav-hash']/li[6]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[6]")
	WebElement viewGST;
	//By me6 = By.xpath("//ul[@class='center nav-hash']/li[7]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[7]")
	WebElement me6;
	//By partnerLogin = By.xpath("//ul[@class='center nav-hash']/li[8]");
	@FindBy(xpath="//ul[@class='center nav-hash']/li[8]")
	WebElement partnerLogin;
	//By from = By.xpath("//input[@placeholder='From']");
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement from;
	//By to = By.xpath("//input[@placeholder='To']");
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement to;
	//By submit = By.xpath("//button[text()='Search Flight ']");
	@FindBy(xpath="//button[text()='Search Flight ")
	WebElement submit;
	//By submit1 = By.xpath("(//button[text()='Search Flight '])[1]");
	@FindBy(xpath="(//button[text()='Search Flight '])[1]")
	WebElement submit1;

	
	public  IndigoHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this); // This is most important when we use Page Factory if we dont add this we will get 
		                                         // Null Pointer Exception as below
	}
	
	
	public  WebElement bookFlight() {
		return bookFlight;
	}

	public  WebElement flightStatus() {
		return (flightStatus);
	}
	
	public  WebElement viewBooking() {
		return (viewBooking);
	}
		
	public  WebElement updateContactdetails() {
		return (updateContactdetails);
	}

	public  WebElement checkin() {
		return (checkin);
	}
	
	public  WebElement viewGST() {
		return (viewGST);
	}
	
	public  WebElement me6() {
		return (me6);
	}

	public  WebElement partnerLogin() {
		return (partnerLogin);
	}
	
	public  WebElement from() {
		return (from);
	}
	
	public  WebElement submit() {
		return (submit);
	}

	
	public  WebElement submit1() {
		return (submit1);
	}


	

}

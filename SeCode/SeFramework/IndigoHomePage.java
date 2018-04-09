/**
 * @author gaurnitai
 * @created_date Oct 5, 2017
 */

package com.indigo.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndigoHomePage {

	// Here we are going to create POM for Indigo website

	// this is the class for HomePage elements
	WebDriver driver;

	By bookFlight = By.xpath("//a[text()='Book Flight']");
	By flightStatus = By.xpath("//ul[@class='center nav-hash']/li[2]");
	By viewBooking = By.xpath("//ul[@class='center nav-hash']/li[3]");
	By updateContactdetails = By.xpath("//ul[@class='center nav-hash']/li[4]");
	By checkin = By.xpath("//ul[@class='center nav-hash']/li[5]");
	By viewGST = By.xpath("//ul[@class='center nav-hash']/li[6]");
	By me6 = By.xpath("//ul[@class='center nav-hash']/li[7]");
	By partnerLogin = By.xpath("//ul[@class='center nav-hash']/li[8]");
	By from = By.xpath("//input[@placeholder='From']");
	By to = By.xpath("//input[@placeholder='To']");
	By submit = By.xpath("//button[text()='Search Flight ']");
	By submit1 = By.xpath("(//button[text()='Search Flight '])[1]");

	public IndigoHomePage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement bookFlight() {
		return driver.findElement(bookFlight);
	}

	public WebElement flightStatus() {
		return driver.findElement(flightStatus);
	}

	public WebElement viewBooking() {
		return driver.findElement(viewBooking);
	}

	public WebElement updateContactdetails() {
		return driver.findElement(updateContactdetails);
	}

	public WebElement checkin() {
		return driver.findElement(checkin);
	}

	public WebElement viewGST() {
		return driver.findElement(viewGST);
	}

	public WebElement me6() {
		return driver.findElement(me6);
	}

	public WebElement partnerLogin() {
		return driver.findElement(partnerLogin);
	}

	public WebElement from() {
		return driver.findElement(from);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement submit1() {
		return driver.findElement(submit1);
	}

}

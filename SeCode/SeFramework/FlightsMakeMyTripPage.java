/**
 * @author gaurnitai
 * @created_date Mar 31, 2018
 */


package com.indigo.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsMakeMyTripPage {
	
	WebDriver driver;
	
	By oneway = By.id("switch__input_1");
	By roundtrip = By.xpath("//input[@id='switch__input_2']");
	By multicity = By.cssSelector("input[id='switch__input_3']");
	By fromcity = By.cssSelector("input#hp-widget__sfrom");
	By tocity = By.cssSelector("input#hp-widget__sTo");
	By search = By.xpath("//button[@id='searchBtn']");
	
	
	public  FlightsMakeMyTripPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement oneway() {
		return driver.findElement(oneway);
	}

	public WebElement roundtrip() {
		return driver.findElement(roundtrip);
	}

	public WebElement multicity() {
		return driver.findElement(multicity);
	}
	
	public WebElement fromcity() {
		return driver.findElement(fromcity);
	}

	public WebElement tocity() {
		return driver.findElement(tocity);
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	

}



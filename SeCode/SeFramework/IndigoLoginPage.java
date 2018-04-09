/**
 * @author gaurnitai
 * @created_date Oct 5, 2017
 */

package com.indigo.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndigoLoginPage {

	WebDriver driver;
	
	public IndigoLoginPage(WebDriver driver) {
		this.driver = driver;
		
	}

	//By username = By.xpath("//input[@placeholder='User ID']");
	By username = By.className("agent-id");

	By password = By.xpath(".//*[@id='agentPass']");
	
	By login = By.xpath(".//*[@id='Agency']/form/ul/li[3]/button");

	public WebElement username() {

		return driver.findElement(username);
	}

	public WebElement password() {
		
		

		return driver.findElement(password);
	}

	public WebElement login() {

		return driver.findElement(login);
	}

}

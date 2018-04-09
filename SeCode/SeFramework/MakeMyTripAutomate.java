/**
 * @author gaurnitai
 * @created_date Mar 5, 2018
 */

package com.selenium.chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "<executable/chromedriver path>");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000); // to make sure page will get loaded successfully before selenium looks for any
							// element
		WebElement from = driver.findElement(By.cssSelector("#hp-widget__sfrom"));
		// WebElement from = driver.findElement(By.xpath("//input[@class='input_fromto
		// checkSpecialCharacters ui-autocomplete-input']"));
		from.click();
		from.sendKeys("PUN\n");

		Thread.sleep(4000);
		WebElement to = driver.findElement(By.cssSelector("#hp-widget__sTo"));
		// WebElement to = driver.findElement(By.xpath("//input[@class='input_fromto
		// checkSpecialCharacters ui-autocomplete-input']"));
		to.click();
		to.sendKeys("BOM\n");

		// to find search button and click

		driver.findElement(By.cssSelector("button[id='searchBtn']")).click();
		Thread.sleep(3000); // to make page will load successfully after clicking on search

		// to click on 4th BOOK button but before that we need to make sure its visible on page to Selenium
		// So to make it visible we need to scroll down first and then click
		
		// to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);

		// to click on 4th BOOK button 
		
		WebElement button4 = driver.findElement(By.xpath("(//a[text()='Book'])[4]"));
		// guys It was my bad - we were trying [ ] as [//a[text()='Book']][4] but
		// actually its parentehsis ()
		// (//a[text()='Book'])[4] - so make sure you put parenthesis

		button4.click();
		System.out.println("Hurray! I have successfully clicked on 4th BOOK button");

	}

}

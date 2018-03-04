/**
 * @author gaurnitai
 * @created_date Mar 4, 2018
 */

package com.selenium.chromebrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "<executable/chromedriver path>");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");

		// to select round trip radio button
		// WebElement roundTrip = driver.findElement(By.xpath("//label[text()='Round
		// Trip']"));
		WebElement roundTrip = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']"));
		roundTrip.click();

		Thread.sleep(5000);

		System.out.println(roundTrip.isSelected());
		if (roundTrip.isSelected()) { // to validate round trip is selected

			Thread.sleep(5000);

			// to enter origin (from) city
			WebElement from = driver.findElement(By.xpath("//input[@class='select_CTXT']"));
			from.click();
			from.sendKeys("DEL\n");
			Thread.sleep(3000);
			// to enter destination (to) city
			WebElement to = driver.findElement(By.xpath("//input[@class='select_CTXT']"));
			to.click();
			to.sendKeys("PUN\n");
		}

		// this line of code is to close the calendar pop up since unless we close
		// calendar window
		// selenium cannot see adult, infant, child dropdown and hence will throw not
		// clickable error
		driver.findElement(By.xpath("//label[text()='Depart date']")).click();

		Thread.sleep(3000); // this sleep is to make sure the selenium will get sufficient time to
							// close calendar window . if we do not put these there will be error

		// to select adult number
		WebElement adult = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
		adult.click();
		Select s = new Select(adult);
		s.selectByVisibleText("3");

		// to select child number
		WebElement child = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Child']"));
		child.click();
		s = new Select(child);
		s.selectByIndex(2);

		// to select infant number
		WebElement infant = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Infant']"));
		infant.click();
		s = new Select(infant);
		s.selectByValue("4");

		// to select currency
		WebElement curr = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		curr.click();
		s = new Select(curr);
		s.selectByVisibleText("INR");

		// to click on search button
		driver.findElement(By.cssSelector("[value='Search']")).click();

		Thread.sleep(3000); // this sleep is to make sure Alert will get sufficient time to get opened

		// When we are entering infant = 4 , we are getting alert message

		// So this context of Java code (87-98) is to handle Alert
		String alertMessageBrd = "If you wish to book a greater number of \n"
				+ "Infants than Adults, please contact our \n" + "reservation center for possible arrangements";

		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		if (alertMessage.equals(alertMessageBrd)) {
			System.out.println("The Alert Pop is displaying valid message");
			alert.accept(); // to click OK button on Alert pop up
		} else {
			System.out.println("The Alert Pop is displaying invalid message");

		}

		Thread.sleep(4000); // this will make sure selenium get sufficient time to close Alert pop up
							// and then click on infant dropdown
		// Now since infant = 4 is not valid so here we are trying to accept another
		// value infant=2 and again searching for flight
		// here we are not finding infant element again since we have already found
		// previously

		infant.click();
		s = new Select(infant);
		s.selectByValue("2");

		// to click on search button
		driver.findElement(By.cssSelector("[value='Search']")).click();

		Thread.sleep(4000); // this sleep is to give sufficient time to load new page after clicking on
							// search

		// Now here I am looking to click on check box "No, I do not have GST" to
		// uncheck that
		// But for that I need to first scroll down and then that check box is visible
		// to scroll down

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		// to find check box "No, I do not have GST" and uncheck that (By default it was
		// check)
		driver.findElement(
				By.cssSelector("input[name='ControlGroupSelectView$ContactInputGSTViewSelectView$CheckBoxGST']"))
				.click();

	}

}

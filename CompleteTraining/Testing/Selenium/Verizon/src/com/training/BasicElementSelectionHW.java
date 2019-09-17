
package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicElementSelectionHW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver = new FirefoxDriver();
		myDriver.get("https://book.spicejet.com/");
		System.out.println("TITLE OF SITE : "+ myDriver.getTitle());
		myDriver.manage().window().maximize();
		myDriver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).sendKeys("Goa");
		Thread.sleep(1000);
		myDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).sendKeys("Chennai");
		Thread.sleep(1000);
//		myDriver.findElement(By.id("custom_date_picker_id_1")).sendKeys(Keys.TAB);
//		myDriver.findElement(By.className("bookbtn")).click();
		myDriver.findElement(By.xpath("//input[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		myDriver.close();
		
	}
}
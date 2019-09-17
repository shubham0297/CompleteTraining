package com.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectOptions2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver = new FirefoxDriver();
		myDriver.get("https://semantic-ui.com/modules/dropdown.html");
		Select selectBox = new Select(myDriver.findElement(By.xpath("//*[@id='example']/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select")));
		
		// 3 ways to select
		// I- By index
		selectBox.selectByIndex(3);
		Thread.sleep(2000);
		
		// II- SElect by value
		
		// III - Select by visible 
		selectBox.selectByVisibleText("HTML");
		Thread.sleep(2000);
		
		selectBox.deselectByValue("HTML");
	
		
		
		// IF MULTISELECT -- if multiselect then also same
		System.out.println(selectBox.isMultiple());
		
		myDriver.close();
	}

	
	
}

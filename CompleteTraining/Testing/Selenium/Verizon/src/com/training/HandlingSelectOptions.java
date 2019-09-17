package com.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectOptions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver = new FirefoxDriver();
		myDriver.get("http://register.rediff.com/register/register.php?FormName=user_details");
//		Select selectBox = new Select(myDriver.findElement(By.id("country")));
//		
//		// 3 ways to select
//		// I- By index
//		selectBox.selectByIndex(3);
//		Thread.sleep(2000);
//		
//		// II- SElect by value
//		selectBox.selectByValue("99");
//		Thread.sleep(2000);
//		
//		// III - Select by visible 
//		selectBox.selectByVisibleText("United States");
//		Thread.sleep(2000);
		
	
		
		
//		// IF MULTISELECT -- if multiselect then also same
//		System.out.println(selectBox.isMultiple());
//		
		
		//TODO - SELECTING A  QUESTION AND SETTING ANSWER
		boolean checked = myDriver.findElement(By.className("nomargin")).isSelected();
	
		System.out.println(checked);
		if(!checked){
			myDriver.findElement(By.className("nomargin")).click();
		}
//		Select selectBox = new Select(myDriver.findElement(By.name("hintq7b1fa5ed")));
		Select select = new Select(myDriver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select")));
		select.selectByIndex(1);
		myDriver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("Dutt Vishesh");
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		myDriver.close();
	}

	
	
}

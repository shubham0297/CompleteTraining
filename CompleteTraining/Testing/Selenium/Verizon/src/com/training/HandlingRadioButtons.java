package com.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver = new FirefoxDriver();
//		myDriver.get("http://www.echoecho.com/htmlforms10.htm");
//		myDriver.manage().window().maximize();
//		
////		TODO - I If a radio button is selected or not
//		myDriver.findElement(By.xpath("//input[@value='Butter']")).click();
//		boolean isSelected = myDriver.findElement(By.xpath("//input[@value='Cheese']")).isSelected();
//		if(isSelected){
//			System.out.println("PASS");
//		}
//		else{
//			System.out.println("FAIL");
//		}
//		Thread.sleep(3000);
//		
//		
//		// TODO - 2 Total no. of radio button on a page --- FINDELEMENTS
//		int count = myDriver.findElements(By.xpath("//input[@type='radio']")).size();
//		System.out.println(count);
//		
//		
//		// TODO - 3 Selecting based on condition
//		List<WebElement> list = myDriver.findElements(By.xpath("//input[@type='radio']"));
//		list.stream().forEach(v->System.out.println(v.getAttribute("value")));
//		
//		// FOR SELECTING A PARTICULAR VALUE
//		list.stream().forEach(v->{ if (v.getAttribute("value").equals("Cheese")) v.click(); });
//		
		
		//TODO 4 - GET ALL HREFS FROM GOOGLE
		myDriver.get("https://google.co.in");
		List<WebElement> list = myDriver.findElements(By.tagName("a"));
		System.out.println("All link count : " + list.size());
//		list.stream().forEach(v->System.out.println(v.getAttribute("href")));
		
		System.out.println("Non-empty links are :");
		list.stream().forEach(v->{if(!v.getText().isEmpty()) System.out.println(v.getText());});
		myDriver.close();
	}

	
	
}

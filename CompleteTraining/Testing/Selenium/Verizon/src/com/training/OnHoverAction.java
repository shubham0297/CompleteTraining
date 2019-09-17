package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OnHoverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://www.amazon.com");
		Actions act = new Actions(myDriver);
		act.moveToElement(myDriver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform();
		myDriver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
		Thread.sleep(2000);
		myDriver.close();
	}
}

//samsaravananr@gmail.com
//9840401130
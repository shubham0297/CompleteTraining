package com.training;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class AbsoluteXPath {
	public static void main(String args[]) throws InterruptedException{
		String browserName = "FF";
		if(browserName.equals("GC")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver myDriver = new ChromeDriver();
			myDriver.get("https://www.google.co.in");
			System.out.println("The title is " + myDriver.getTitle());
			myDriver.close();
		}
		else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				WebDriver myDriver = new FirefoxDriver();
				myDriver.get("https://www.softwarecertifications.org");
				myDriver.manage().window().maximize();
				System.out.println("The title is " + myDriver.getTitle());
				Thread.sleep(2000);
				String tag = myDriver.findElement(By.xpath("//nav[@id='site-nav']/ul/li[4]/a")).getTagName(); 	// ABsolute path ...from a nav tag with id site = site-nav
				// OR
				
//				String tag1 = myDriver.findElement(By.xpath("//nav[@id='site-nav']/ul/*[4]/a)")).getTagName(); 	// ABsolute path ...from a nav tag with id site = site-nav
				System.out.println(tag);
//				System.out.println(tag1);
				myDriver.close();
		}
	}
}

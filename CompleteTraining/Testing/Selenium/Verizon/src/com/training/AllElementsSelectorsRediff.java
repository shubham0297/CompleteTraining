package com.training;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class AllElementsSelectorsRediff{
		public static void main(String args[]) throws InterruptedException{
			String browserName = "IE";
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
					myDriver.get("https://rediff.com/");
					System.out.println("The title is " + myDriver.getTitle());
					myDriver.manage().window().maximize();
					Thread.sleep(2000);
					myDriver.findElement(By.id("srchword")).sendKeys("watches"); 	Thread.sleep(1000);
					myDriver.findElement(By.className("newsrchbtn")).click(); 		Thread.sleep(1000);
					myDriver.findElement(By.id("lowprice")).sendKeys("5000");		Thread.sleep(1000);
					myDriver.findElement(By.id("highprice")).sendKeys("10000");		Thread.sleep(1000);
					myDriver.findElement(By.className("pr_rangebtn")).click();		Thread.sleep(1000);
					myDriver.findElement(By.linkText("Become a Seller")).click();	Thread.sleep(1000); 	// Used to select an href link by full matching text ie. Become a seller
					myDriver.findElement(By.partialLinkText("Forgot")).click();		Thread.sleep(1000);		// Used to select an href link by partial matching text ie. Forgot of Forgot Password
					myDriver.findElement(By.xpath("//input[@id='login']")).sendKeys("Shubham");	Thread.sleep(1000);	
					Thread.sleep(2000);
					
					myDriver.close();
			}
			else if(browserName.equals("IE")){
				System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				WebDriver myDriver = new InternetExplorerDriver();
				myDriver.get("https://www.google.co.in");
				System.out.println("The title is " + myDriver.getTitle());
				myDriver.close();
			}
		}
}

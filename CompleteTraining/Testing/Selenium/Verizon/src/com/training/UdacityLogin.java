package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class UdacityLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://auth.udacity.com/sign-up?next=https%3A%2F%2Fmentor-dashboard.udacity.com%2F");
		myDriver.manage().window().maximize();
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[1]/button[2]")).click();
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div[3]/div[3]/div/form/div/div[1]/input")).sendKeys("shubham.0297@yahoo.in");
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div[3]/div[3]/div/form/div/div[2]/input")).sendKeys("shubham@1997");
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div[3]/div[3]/div/form/button")).click();
//		myDriver.findElement(By.xpath
//		myDriver.findElement(By.className("//*[@id='root']/div/div/div[1]/div[1]/div[2]/aside/a[2]/span[2]")).getText();
//		myDriver.findElement(By.cssSelector("#root > div > div > div.sidebar-layout_layout__3UZVQ.sidebar-layout_hasLeftNav__38F-s > div.sidebar-layout_content__30qST > div:nth-child(2) > header > div > div.overview_header-actions__1YWI3 > div > div > div.queue-controls_top-row__5WKJ6 > div:nth-child(1) > button")).click();
//		WebDriver home = new FirefoxDriver();
		Thread.sleep(10000);
		myDriver.get("https://mentor-dashboard.udacity.com/reviews/overview");
//		myDriver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div[2]/div[2]/header/div/div[2]/div/div/div[1]/div[1]/button")).click();
		System.out.println(myDriver.getTitle());
		System.out.println(myDriver.findElement(By.xpath(" ")));
		myDriver.close();
	}

	
	
}

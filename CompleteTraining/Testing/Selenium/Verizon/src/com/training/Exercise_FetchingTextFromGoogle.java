package com.training;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Exercise_FetchingTextFromGoogle {
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
				myDriver.get("https://google.com/");
				myDriver.manage().window().maximize();
				System.out.println("The title is " + myDriver.getTitle());
				Thread.sleep(2000);

				myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Testing");;
				Thread.sleep(2000);
//				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input"))/*xpath of input search of google*/.sendKeys("Samsung Mobiles");		// sendKey = Message to pass
				myDriver.findElement(By.className("gNO89b")).click();
				
//				TODO -1  - Fetching (About XXXXXXX result found )
				String result = myDriver.findElement(By.id("resultStats")).getText();
				System.out.println(result);
				
//				TODO -2  - Enter something...click search...now from this page get the entered text
				String inputText = myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).getAttribute("value");   // FOr dynamic values
				System.out.println(inputText);
				Thread.sleep(2000);
//				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"))/*xpath of Google search button after typing something in google*/.click();;
//				Thread.sleep(3000);
				myDriver.close();
		}
	}
}

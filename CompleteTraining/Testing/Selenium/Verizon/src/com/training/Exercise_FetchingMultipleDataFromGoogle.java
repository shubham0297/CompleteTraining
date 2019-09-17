package com.training;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Exercise_FetchingMultipleDataFromGoogle {
	public static void main(String args[]) throws InterruptedException{
		
		String arr[] = {"Apple XS","Samsung Note 10", "One Plus 7 Pro","Redmi K20","Pixel3"};
		
		String browserName = "FF";
		if(browserName.equals("GC")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver myDriver = new ChromeDriver();
			myDriver.get("https://www.google.co.in");
			System.out.println("The title is " + myDriver.getTitle());
			myDriver.close();
		}
		else if(browserName.equals("FF")){
				
			String result="";
			String enteredText="";
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver = new FirefoxDriver();
			myDriver.get("https://google.com/");
			myDriver.manage().window().maximize();
			myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(arr[0]);
			myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
			enteredText= myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).getAttribute("value"); 
			if(enteredText.equals(arr[0])){
				System.out.println("Values Match");
				Thread.sleep(2000);
				result = myDriver.findElement(By.id("resultStats")).getText();
				System.out.println(result);
			}
			else
			{
				System.out.println("Values Don't match");
			}
				for(int i=1;i<arr.length;i++)
				{
					myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).clear();
					myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(arr[i]);
					enteredText = myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).getAttribute("value"); 
					if(enteredText.equals(arr[i])){
						System.out.println("Values Match");
						myDriver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
						result = myDriver.findElement(By.id("resultStats")).getText();
						System.out.println(result);
						Thread.sleep(2000);
					}
					else
					{
						System.out.println("Values Don't Match");
					}
					
				}
				myDriver.close();
				
	//				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]"))/*xpath of Google search button after typing something in google*/.click();;
	//				Thread.sleep(3000);
					
		}
	}
}

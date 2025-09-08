package com.selenium.day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	Thread.sleep(3000);
	try {
	driver.get("https://www.gmail.com");
	
	driver.findElement(By.id("identifierId")).sendKeys("anurag.das0303@gmail.com");
	
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
	
	Thread.sleep(10000);
	
	driver.findElement(By.name("Passwd")).sendKeys("1234567890");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#passwordNext > div > button > span")).click();
	Thread.sleep(3000);
	}finally {
		driver.quit();
	}
	}
}

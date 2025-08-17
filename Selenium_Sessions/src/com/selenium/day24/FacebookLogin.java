package com.selenium.day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("anurag.das0303@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		} finally {
			driver.quit();
		}
		
	}

}

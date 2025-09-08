package com.selenium.day24;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		FileInputStream input = new FileInputStream("config.properties");
		p.load(input);
		
		String email = p.getProperty("naukri.email");
		String password = p.getProperty("naukri.password");
		String chromeDriver = p.getProperty("driver.path");
		
		
    	System.setProperty("webdriver.chrome.driver",chromeDriver);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			driver.get("https://www.naukri.com/nlogin/login");
			
			driver.findElement(By.id("usernameField")).sendKeys(email);
			driver.findElement(By.id("passwordField")).sendKeys(password);
			Thread.sleep(3000);
		
			//  driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(6000);
			
		} finally {
			driver.quit();
		}
	}

}

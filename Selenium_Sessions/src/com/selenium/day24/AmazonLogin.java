package com.selenium.day24;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("config.properties");
		prop.load(file);
		
//		String uName = prop.getProperty("amazon.email");
		String pass = prop.getProperty("amazon.password");
		String uNum = prop.getProperty("amazon.number");
		String chromeDriver = prop.getProperty("driver.path");
		
		System.setProperty("webdriver.chrome.driver",chromeDriver);
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.amazon.in");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-link-accountList")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("ap_email_login")).sendKeys(uNum);
			Thread.sleep(2000);
			
			driver.findElement(By.className("a-button-input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("ap_password")).sendKeys(pass);
			Thread.sleep(2000);
			
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
			Thread.sleep(2000);
			
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(5000);
			
			}finally {
			driver.quit();
		}
	}

}

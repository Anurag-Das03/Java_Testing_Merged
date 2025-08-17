package com.selenium.day24;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream("config.properties");
		prop.load(f);
		
		String email = prop.getProperty("naukri.email");
		String password = prop.getProperty("naukri.password");
		String resumePath = prop.getProperty("resume.path");
		String chromeDriver = prop.getProperty("driver.path");
		
		
		 System.setProperty("webdriver.chrome.driver", chromeDriver);
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        try {
	            driver.get("https://www.naukri.com/nlogin/login");

	            driver.findElement(By.id("usernameField")).sendKeys(email);
	            driver.findElement(By.id("passwordField")).sendKeys(password);
	            Thread.sleep(2000);
	            driver.findElement(By.cssSelector("button[type='submit']")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.className("nI-gNb-bar2")).click();
	            Thread.sleep(2000);
	            
	            driver.findElement(By.className("nI-gNb-info__sub-link")).click();
	            Thread.sleep(2000);
	            
	            // Upload resume
	            File newFile = new File(resumePath);
	            WebElement fileInput = driver.findElement(By.id("attachCV"));
	            fileInput.sendKeys(newFile.getAbsolutePath());
	            Thread.sleep(3000);
	            System.out.println("Uploaded successfully!");

	        }finally {
	        	driver.quit();
	        }
		
		
		
	}
}

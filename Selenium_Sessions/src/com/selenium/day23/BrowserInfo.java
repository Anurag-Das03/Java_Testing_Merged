package com.selenium.day23;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String browserName = options.getBrowserName();
		
		System.out.println("Browser name: "+ browserName);
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String version = caps.getBrowserVersion(); 
		System.out.println("Browser version: " + version);

	}

}

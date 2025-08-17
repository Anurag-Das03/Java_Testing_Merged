package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {
	public static void main(String[] args) throws InterruptedException {

		    WebDriver driver = new ChromeDriver();
		  
		    driver.manage().window().maximize();

		    driver.get("https://www.google.com");
		    Thread.sleep(2000);
		        
		    driver.get("https://www.facebook.com");
		    Thread.sleep(2000);
		        
	        driver.get("https://www.youtube.com");
		        
		     driver.switchTo().newWindow(WindowType.TAB);
		     driver.get("https://www.youtube.com");
		 
		     Thread.sleep(5000);
		     driver.quit();
		    }
}

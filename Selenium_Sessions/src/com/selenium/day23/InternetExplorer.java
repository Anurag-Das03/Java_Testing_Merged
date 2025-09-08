package com.selenium.day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.com");
		driver.quit();

	}

}

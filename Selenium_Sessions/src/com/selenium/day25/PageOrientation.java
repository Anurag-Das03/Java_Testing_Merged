package com.selenium.day25;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class PageOrientation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		
		PrintOptions po = new PrintOptions();
		po.setOrientation(PrintOptions.Orientation.LANDSCAPE);
		PrintOptions.Orientation current_orientation = po.getOrientation();
		
		System.out.println(current_orientation);
		Thread.sleep(3000);
		driver1.quit();
		
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com");
		PrintOptions po1 = new PrintOptions();
		po1.setOrientation(PrintOptions.Orientation.PORTRAIT);
		PrintOptions.Orientation currentOrientation = po.getOrientation();
		
		System.out.println(currentOrientation);
		Thread.sleep(3000);
		driver2.quit();
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.google.com");
		PrintOptions po3 = new PrintOptions();
		po3.setPageRanges("1-6");
		String[] curr = po3.getPageRanges();
		
		System.out.println(Arrays.toString(curr));
		Thread.sleep(3000);
		driver3.quit();
		
		
	}

}

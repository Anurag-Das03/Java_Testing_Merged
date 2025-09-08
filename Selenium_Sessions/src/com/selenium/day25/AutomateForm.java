package com.selenium.day25;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		        driver.get("https://360homedecor.uk/book-appointment");
		        driver.manage().window().maximize();

		        driver.findElement(By.id("first_name")).sendKeys("Anurag");
		        Thread.sleep(2000);
		        driver.findElement(By.id("last_name")).sendKeys("Das");
		        Thread.sleep(2000);
		        driver.findElement(By.id("apt_city")).sendKeys("Purulia");
		        Thread.sleep(2000);
		        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		        Thread.sleep(2000);
		        driver.findElement(By.id("phone_number")).sendKeys("7063291720");
		        Thread.sleep(2000);

		        WebElement dropDown = driver.findElement(By.id("choose_branch"));
		        Select select = new Select(dropDown);
		        select.selectByVisibleText("Veneer");
		        Thread.sleep(2000);

		        WebElement dropDown2 = driver.findElement(By.id("choose_style"));
		        Select s = new Select(dropDown2);
		        s.selectByVisibleText("Artdeco");
		        Thread.sleep(2000);

		        File upload = new File("C:\\Users\\Anurag\\Downloads\\SoftwareTesting.pdf");
		        WebElement file = driver.findElement(By.id("layoutFiles"));
		        file.sendKeys(upload.getAbsolutePath());
		        Thread.sleep(2000);
		       
//		       driver.findElement(By.id("privacyPolicy")).click();
//		       Thread.sleep(2000);

		       WebElement wb = driver.findElement(By.xpath("//*[@id=\"appointment_form\"]/div[10]/button"));
		       wb.click();


		}

}

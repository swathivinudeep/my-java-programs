package com.neo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.Base;

public class MyntraTest extends Base{

	public static void main(String[] args) throws InterruptedException {
		//Launching web url myntra
		driver.get("https://www.myntra.com/men-tshirts?src=bNav");
		
		//maximising driver
	   //driver.manage().window().maximize();
		
		//Trying to click on dropdown
		driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[1]/section/div[1]/div[2]/div/div")).click();
		
	
		Thread.sleep(3000);
		
		//Clicking on low to high option in dropdown
		
		//driver.findElement(By.xpath("//label[@class='sort-label ']/input[@value = 'low']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[@class='sort-label ']/input[@value = 'low']")));
		
	/*	WebElement low = driver.findElement(By.xpath("//label[@class='sort-label ']/input[@value = 'low']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", low);*/

		Thread.sleep(4000);
		//quitting browser
		driver.quit();
	}

}

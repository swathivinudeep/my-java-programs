package com.neo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserclass {
	static {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	}
	protected static	WebDriver driver= new ChromeDriver();
}

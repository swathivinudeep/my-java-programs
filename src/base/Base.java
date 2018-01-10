package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//creating static block
static
{
	//setting properties for firefox/geckodriver
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
	
	//setting properties for chrome driver
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
}
	
	//assigning webdriver to firefox driver
protected static	WebDriver driver= new ChromeDriver();



	
}


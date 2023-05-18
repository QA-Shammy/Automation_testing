package com.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser") // This is testNG advance annotation
	public void setup(String browser)  {
		
		if (browser.equalsIgnoreCase("Edge")) {
			System.out.println(" Test will execute with Edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println(" Test will execute with Chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.out.println(" Test will execute with Firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	}
	}
	
	@AfterTest
	public void TearDown() {
		//driver.quit();
		System.out.println("Browser will close");
	}
	
	@Test
	public void getTest()  {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("get Test");
		
	}


}

package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	// How to handle data with help of testNG data provider?
	// How initialize the data provider?
	
	WebDriver driver;
	
	@DataProvider(name = "Authentication")
	public static Object [][] credential(){
		return new Object[][] {{"tanvirpatwary16@gmail.com","Tester01"},
			                   {"tanvirpatwary45@gmail.com","Tester001"},
			                   {"tanvirpatwary00@gmail.com","Tester000"}};
		
	}
	@Test(dataProvider ="Authentication" )
	public void getlogin(String Username, String Password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

			
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Username ");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		}
	
		
	}
	

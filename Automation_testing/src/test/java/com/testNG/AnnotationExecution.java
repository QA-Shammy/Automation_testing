package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExecution {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Browser will open");

	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser will close");

	}

	@Test
	public void getTest() {
		System.out.println("Test1 will executed");
		
		}
	@Test
	public void getTest2() {
		System.out.println("Test2 will executed");
	}	
	
	
}

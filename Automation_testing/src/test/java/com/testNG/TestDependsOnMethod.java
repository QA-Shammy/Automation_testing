package com.testNG;

import org.testng.annotations.Test;
public class TestDependsOnMethod {
    @Test
	public void getmethod1() {
		
	System.out.println("Browser open");
	}
    
    @Test(dependsOnMethods= {"getmethod1"})
   	public void getmethod2() {
   		
   	System.out.println("Successfully login the application");
   	}
    
    @Test(dependsOnMethods= {"getmethod2"})
   	public void getmethod3() {
   		
   	System.out.println("Expected and Actual Matching");
   	}
    
}
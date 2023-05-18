package com.testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	// how to run same test cases multiple time?
	
	@Test(invocationCount=5)
    public void gettest() {
	System.out.println("Test will execute");
}
}

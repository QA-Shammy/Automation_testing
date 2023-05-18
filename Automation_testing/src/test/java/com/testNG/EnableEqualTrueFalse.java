package com.testNG;

import org.testng.annotations.Test;

public class EnableEqualTrueFalse {
	@Test(enabled=true)
	public void getMethod1() {
		System.out.println("Test1");
	}
	@Test(enabled=false)
	public void getMethod2() {
		System.out.println("Test2");
	}
	@Test(enabled=true)
	public void getMethod3() {
		System.out.println("Test3");
	}
}

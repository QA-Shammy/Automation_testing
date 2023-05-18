package com.testNG;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=2)
	public void getMethod1() {
		System.out.println("Test1");
	}
	@Test(priority=1)
	public void getMethod2() {
		System.out.println("Test2");
	}
	@Test(priority=0)
	public void getMethod3() {
		System.out.println("Test3");
	}
}

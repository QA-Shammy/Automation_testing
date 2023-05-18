package com.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.usa.basepage.SuperClass;
import com.usa.genericfuntions.CommonMethods;

public class Test_Listener extends SuperClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test will start"+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test will success"+ result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test will fail and take screenshot"+ result.getName());
		CommonMethods.captureScreenshot(driver, "fail test");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	

}

package com.usa.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin=  {"pretty","json:target/cucumber.json"},
		features = {".//Features/"},
		glue = {"com.usa.stepdefinition","com.usa.hooks"}
		
		
		)
public class My_Runner extends AbstractTestNGCucumberTests {

}

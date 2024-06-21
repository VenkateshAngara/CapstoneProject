package com.wipro.cucumberTestcase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature/Menulink.feature", glue = { "com.wipro.cucumberTestcase" }, plugin = { "pretty",
		"html:test-output/htmlreport" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests{

}

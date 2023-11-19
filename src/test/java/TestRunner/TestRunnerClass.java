package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/Project_features"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition",
tags = {"@Next4"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void StartURL() throws Exception {
	    BaseClass Base = new BaseClass();
	    Base.Browser();
		
	}
@AfterTest
	public void CloseURL() throws Exception {
		BaseClass Base = new BaseClass();
		//Thread.sleep(2000);
	    Base.driver.quit();
		

    }
}
package com.TestRunnerRoseGarden.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UtilityRoseGarden.qa.BaseRoseGarden;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 @CucumberOptions(features={"src/test/RoseGardenResourses/RoseGardenFeatures"},
 plugin={"json:target/cucumber.json"},
 glue= "com.StepDeptRoseGarden.qa", tags= {"@Login"})

public class RunnerRoseGarden  extends AbstractTestNGCucumberTests{

	
	@BeforeTest
	public void startURl() {
		BaseRoseGarden test =new BaseRoseGarden();
		
		test.initRoseGardenrowser();
	}
	
	@AfterTest
	public void closeURL() {
		BaseRoseGarden test =new BaseRoseGarden();
		test.driver.quit();
	}
}

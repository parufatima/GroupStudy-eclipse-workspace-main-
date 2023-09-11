package com.StepDeptRoseGarden.qa;

import com.UtilityRoseGarden.qa.BaseRoseGarden;

import cucumber.api.java.en.Given;

public class LoginStepDeptRoseGarden  extends BaseRoseGarden{
	
	@Given("^Launch the application<\"([^\"]*)\">$")
	public void launch_the_application(String URL) throws Throwable {
		
		lunchURL(URL);


	}

}

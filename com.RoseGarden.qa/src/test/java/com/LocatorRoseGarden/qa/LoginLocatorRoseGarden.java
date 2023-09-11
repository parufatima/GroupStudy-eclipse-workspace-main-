package com.LocatorRoseGarden.qa;

import org.openqa.selenium.support.PageFactory;

import com.UtilityRoseGarden.qa.BaseRoseGarden;

public class LoginLocatorRoseGarden extends BaseRoseGarden{
	
	
	public LoginLocatorRoseGarden() {
		PageFactory.initElements(driver, this);
	}
	

}

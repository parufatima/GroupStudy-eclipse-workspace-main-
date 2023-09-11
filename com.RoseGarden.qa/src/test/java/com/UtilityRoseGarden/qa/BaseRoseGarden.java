package com.UtilityRoseGarden.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseRoseGarden {
	
	public static Properties roseGardenProp;
	public static WebDriver driver;
	
	public BaseRoseGarden() {
		
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\ConfigRoseGarden\\qa\\configRoseGarden.properties");
			
			roseGardenProp = new Properties();
			roseGardenProp.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public void initRoseGardenrowser() {
		
		 String BankBrowserset = roseGardenProp.getProperty("Browser2");
		 if(BankBrowserset.equals("Chrome")) {
				
			 WebDriverManager.chromedriver().setup();	 
			 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				

}
		 else if(BankBrowserset.equals("FireFox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
				
			}
		 
	}
	 public static void lunchURL(String URL) {
			driver.get(roseGardenProp.getProperty("URL"));
			
		}

}

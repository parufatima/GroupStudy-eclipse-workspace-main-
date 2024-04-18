package GroupStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browsersetup {
	
	static WebDriver driver;
	
	static String URL= "https://www.amazon.com/";
	
	@Test
	
	public void amzonBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(URL);
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	
		//find current url
		
	  System.out.println("Name of current URL is: " +driver.getCurrentUrl());
		
		
		//title of the current page
	  
	  System.out.println("This the Title of the current page :  "+driver.getTitle());
	  
	  //How to find the total link
	  
	 List<WebElement> totalLink = driver.findElements(By.tagName("a"));
	 
	 System.out.println(totalLink.size());
	  
	//How to print all link
	 
	 
	 for(int i=0; i<totalLink.size();i++) {
		 
		 System.out.println(totalLink.get(i).getAttribute("href"));
	 }
	  
	  
	  
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
	}

}

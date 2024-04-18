package GroupStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class exam {
	
	static WebDriver driver;
	
	static String URL = "https://www.ebay.co.uk/";
	
	@Test
	public void ebay1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		 WebElement cookies = driver.findElement(By.xpath("//*[@id='gdpr-banner-decline']"));
		 
		 cookies.click();
		
		 //drop down ; We use select class for handle drop down 
		
		WebElement categories = driver.findElement(By.xpath("//*[@id='gh-cat']"));
		
		Select s1 = new Select(categories);
		
		s1.selectByVisibleText("Antiques");
		
		WebElement searchBtn =  driver.findElement(By.id("gh-btn"));
		searchBtn.click();
		
		  boolean verifySearch =  driver.findElement(By.id("s0-27_1-9-0-1[0]-0-2-0-title")).isDisplayed();
		  
		  Assert.assertTrue(verifySearch);
		  
		  System.out.println(verifySearch);
		
		
		driver.quit();
		
		 
		
		 //mouse Over
	}
	
	

}

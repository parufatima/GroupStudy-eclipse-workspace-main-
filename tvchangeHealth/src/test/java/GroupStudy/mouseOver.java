package GroupStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseOver {
	static WebDriver driver;
	static String URL = "https://www.amazon.com/";
	@Test
	public void amazonmouseOver() throws Exception   {
		
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//to write something with mouse
		
		WebElement searchField = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		
		Actions ac = new Actions (driver);
		
		ac.moveToElement(searchField).click().sendKeys("Books").build().perform();
		
		Thread.sleep(3000);
		
		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		
		searchBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement accountList = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		
		
		
	//	WebElement registory = driver.findElement(By.xpath("//*[text()='Find a List or Registry']"));
	//	registory.click();
		
		
		
		
			
		driver.quit();
		
	}

}

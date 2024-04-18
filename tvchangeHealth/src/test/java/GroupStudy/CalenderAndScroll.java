package GroupStudy;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderAndScroll {
	static WebDriver driver;
	static String URL = "https://www.southwest.com/";
	@Test
	
	public void SouthEastCalender() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(URL);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		
		JavascriptExecutor date = (JavascriptExecutor)driver;
		
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value='2/20/2023'");
		
		Thread.sleep(3000);
		
		date.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='2/29/2023'");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

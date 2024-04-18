package GroupStudy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameHandle {
	static WebDriver driver;
	static String URL = "https://www.paychex.com/login";

	@Test
	public void pacchexFrameHandle() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(URL);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		
		WebElement login= driver.findElement(By.xpath("//*[text()='Paychex Flex login']"));
		login.click();
		
		
		Set<String> window=   driver.getWindowHandles();
		
		    Iterator<String> ite= window.iterator();
		
		 String window1 =   ite.next();
		 String window2 =   ite.next();
		 
		 driver.switchTo().window(window2);
		 
      System.out.println("The title of  window2 is: " + driver.getTitle());
		
		
		driver.switchTo().frame("login");
		
		boolean verify = driver.findElement(By.id("paychex-logo")).isDisplayed();
		Assert.assertTrue(verify);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(window1);
		
		Thread.sleep(3000);
		
		System.out.println("The title of  window1 is: " + driver.getTitle());
		
		driver.quit();
		
	}

}

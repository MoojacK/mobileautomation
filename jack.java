package nmk.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class jack
{
	
		public WebDriver driver;
		@BeforeSuite
		public void starting()
		{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://mobileworld.azurewebsites.net/");
		}
		
		
		

		@AfterSuite
		public void ending()
		{
		driver.quit();
		}
	}


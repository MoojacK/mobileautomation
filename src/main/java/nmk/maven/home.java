package nmk.maven;

import java.awt.AWTException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class home extends jack
{
		
		@Test(priority = 1)
		public void latest() throws InterruptedException, AWTException
		{
			
			WebElement var = driver.findElement(By.id("navbarDropdown"));

			Assert.assertTrue(var.isDisplayed());

			JavascriptExecutor j = (JavascriptExecutor) driver;

			j.executeScript("window.scrollBy(0,700)");

			Thread.sleep(2000);

			WebElement value = driver.findElement(By.xpath("(//a[@class='btn btn-primary '])[1]"));

			value.click();

		WebElement ele = driver.findElement(By.id("navbarDropdown"));
			ele.click();

			driver.findElement(By.linkText("Order")).click();

			Set<String> window = driver.getWindowHandles();
			List<String> list= new ArrayList<String>(window);
			driver.switchTo().window(list.get(1));
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo() .window(list.get(0));
		Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);

			driver.findElement(By.linkText("Contact Us")).click();
			System.out.println(driver.getTitle());
			
			Set<String> window2 = driver.getWindowHandles();
			List<String> list2= new ArrayList<String>(window2);
			driver.switchTo().window(list2.get(1));
			System.out.println(driver.getTitle());
			driver.close();
			driver.switchTo() .window(list2.get(0));
			Thread.sleep(2000);
			
			

			Thread.sleep(1000);

			driver.findElement(By.xpath("//footer[@class='footer'] //a[.='Home']")).click();

			
            
			

		}

}

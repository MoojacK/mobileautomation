package nmk.maven;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Signup extends contact_us {
	@Test(priority = 5)
	public void Sigup() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Sign up']")).click();
		WebElement fristname = driver.findElement(By.xpath("//input[@id='myName']"));
		fristname.sendKeys("Moo");
		WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Last_name.sendKeys("jack");
		WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
		Email.sendKeys("reno@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
		password.sendKeys("nmk@123");
		WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
		Phone_number.sendKeys("8892929923");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
		bio_story.sendKeys("nothing is there to tell");
		driver.findElement(By.xpath("//input[@type='date']")).click();
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
		Alert Al = driver.switchTo().alert();
		Al.accept();
		Thread.sleep(3000);
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		user_name.click();
		user_name.sendKeys("nmk@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.click();
		Password.sendKeys("jack@123");
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(3000);
	}
}
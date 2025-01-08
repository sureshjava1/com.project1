package webelements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumlearn.Userdefined;

public class Seleniumwebelements {
	
	//// we need to use in config file: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		
		Userdefined ud=new Userdefined();
		driver=ud.browserchoice();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		
		
		//ud.driverquit();
		
	}
}
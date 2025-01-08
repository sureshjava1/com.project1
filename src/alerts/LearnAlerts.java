package alerts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumlearn.Userdefined;
//https://the-internet.herokuapp.com/javascript_alerts
public class LearnAlerts {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Userdefined d=new Userdefined();
		driver=d.browserchoice();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		System.out.println(driver.switchTo().alert().getText());// to print the text displayed on alert window
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("surya");// to enter the text in the alert text box window.
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//d.driverquit();
		
	
	

	}

}

package windowLearn;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumlearn.Userdefined;

public class WindowHandling {

	static WebDriver driver;
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		Userdefined d=new Userdefined();
		driver=d.browserchoice();
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		Set<String> win=driver.getWindowHandles();
		
		for(String s:win)
		{
			if(!s.equals(parentWindow))
			{
				driver.switchTo().window(s);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
		}
		
		
		
    }
}

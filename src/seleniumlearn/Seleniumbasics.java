package seleniumlearn;


import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class Seleniumbasics {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		
		
		Userdefined sc=new Userdefined();
		driver=sc.browserchoice();
		
		
		
		String s=driver.getCurrentUrl();
		
		System.out.println(s);
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		//System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		driver.close();
		
	} 
}

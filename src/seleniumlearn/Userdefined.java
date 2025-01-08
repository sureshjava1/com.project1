package seleniumlearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Userdefined {

	public static WebDriver driver;
	
	//reading the config text file stored in Datafiles folder and launching particular browser mentioned in config file along with url
	
	public WebDriver browserchoice() throws  IOException
	{
	
		File file=new File(System.getProperty("user.dir")+"/Datafiles/config.properties");
		/* File is a class in selenium ,which is used to load the file in the system
		 * (System.getProperty("user.dir") ,it goes to project root + "path "the path where is the file present.
		 * so file was loaded successfully
		 */
		
		FileInputStream fis=new FileInputStream(file);// stored inside FileInputStream 
		Properties config=new Properties();// reads the properties file
		config.load(fis);// loading the stored file "fis"
		
		String browser=config.getProperty("browser");// it reads the browser value from config.properties file and stores as string in browser
	if(browser.equalsIgnoreCase("chrome"))
	{
		      driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("ff"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		 driver=new ChromeDriver();
	}
	driver.get(config.getProperty("url"));
	driver.manage().window().maximize();
	return driver;
	}
	
	public  void driverquit()
	{
		driver.quit();
	}
	
}

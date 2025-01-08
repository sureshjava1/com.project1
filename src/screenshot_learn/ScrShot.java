package screenshot_learn;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.google.common.io.Files;

public class ScrShot {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//			ChromeOptions opt=new ChromeOptions();
//			opt.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://google.com");	        
	        long timeStamp = Calendar.getInstance().getTime().getTime();
	        	System.out.println(timeStamp);
	        
	        String title=driver.getTitle();
	        if(title.equals("abc"))
	        {
	        	System.out.println("Test case pass");
	        }
	        else
	        {
	        	System.out.println("Test case fail"); 
	        	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);/*TakesScreenshot" is a interface ,
	        	we are capturing screen shot and saving in  "file"*/
		        Files.copy(file, new File(System.getProperty("user.dir")+"/Screenshots\\screenshot"+timeStamp+".png")); /*we are copying the screen shot
		         in the "screenshot" folder with time stamp in order to add new screen shots.*/
		        //C:\Users\darad\eclipse-workspace\Learn_java
	        }
	        
	        
	        System.out.println(timeStamp);
	        
	        driver.quit();
	}

}

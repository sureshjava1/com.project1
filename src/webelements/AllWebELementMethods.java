package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumlearn.Userdefined;

public class AllWebELementMethods {

	// we need to use in config file: https://the-internet.herokuapp.com/forgot_password
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		Userdefined ud=new Userdefined();
		
		driver=ud.browserchoice();
		
		Thread.sleep(2000);
		
		WebElement forPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		WebElement email=driver.findElement(By.xpath("//label[text()='E-mail']"));
		WebElement passTextBox=driver.findElement(By.id("email"));
		WebElement retButton=driver.findElement(By.id("form_submit"));
		
		String headingText=forPassword.getText();
		
		if(headingText.contains("Forgot Password"))
		{
			System.out.println(email.getText()+" this is lable text");
			boolean b=passTextBox.isDisplayed();
			b&=passTextBox.isEnabled();
			if(b)
			{
				passTextBox.clear();
				passTextBox.sendKeys("hello@abc.com");
			}
			else
			{
				System.out.println("email textbox is not displayed/enagled");
			}
			
			
			Dimension d=passTextBox.getSize();
			System.out.println(d.height+"\t"+d.width);
			
			
			Point p=retButton.getLocation();
			System.out.println(p.x+"\t"+p.y);
			
			retButton.click();
			WebElement errorMessage=driver.findElement(By.xpath("//h1[text()='Internal Server Error']"));
			String dataMessage=errorMessage.getText();
			
			if(dataMessage.equals("Internal Server Error"))
			{
				System.out.println("Testcase pass");
			}
			else
			{
				System.out.println("testcase fail");
			}
		}
		else
		{
			System.out.println("user landed on incorrect page");
		}
		
		
		Thread.sleep(2000);
		
		ud.driverquit();

	}

}

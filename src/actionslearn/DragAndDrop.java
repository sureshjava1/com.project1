package actionslearn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumlearn.Userdefined;

public class DragAndDrop {
	
	static WebDriver driver;
	
	//url=https://the-internet.herokuapp.com/drag_and_drop
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Userdefined ud=new Userdefined();
		driver=ud.browserchoice();
		
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		act.contextClick();
		act.scrollToElement(drop).build().perform();
		
	}

}

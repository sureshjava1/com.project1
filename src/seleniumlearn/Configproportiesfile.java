package seleniumlearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configproportiesfile {
	
	//reading the config text file stored in Datafiles folder 
	
	public  void configfile() throws IOException
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
	   System.out.println(browser);
	}
	

}

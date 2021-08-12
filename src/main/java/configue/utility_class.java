package configue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_class {


	public static String readdata(String key) throws IOException
	{
		
		Properties pr = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Yash Sawant\\eclipse-workspace\\kite_app\\user.properties");
		pr.load(file);
		String value= pr.getProperty(key);
		return value;
	}
	
	public static void takescreenshot(WebDriver driver,int ID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Yash Sawant\\eclipse-workspace\\mavenproject\\screenshot\\testcase"+ID+".jpg");
		
		FileHandler.copy(src, dest);
		
	}
	
	
}

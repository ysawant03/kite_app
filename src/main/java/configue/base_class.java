package configue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {

			
		public WebDriver driver;
		public void initiliseBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Sawant\\Desktop\\New folder\\chromedriver.exe");
			

			 driver=new ChromeDriver();
			
			driver.get("https://kite.zerodha.com");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							
		}
	
	
}

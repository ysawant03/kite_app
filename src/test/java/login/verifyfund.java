package login;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configue.base_class;
import configue.utility_class;


public class verifyfund extends base_class {

	int TCID = 101;
	kitelogin1 login1;
	kitelogin2 login2;
	kitehome home;
	
	
	@BeforeClass
	
	public void openbrowser() 
	
	{
		initiliseBrowser();
		login1 = new kitelogin1(driver);
		login2 = new kitelogin2(driver);
		home = new kitehome(driver);
	}
	
	@BeforeMethod
	
	public void login() throws IOException
	{
		login1.enterusername(utility_class.readdata("UN"));
		login1.enterpassword(utility_class.readdata("PWD"));
		login1.clickonsubmit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login2.enterpin(utility_class.readdata("PIN"));
		login2.clickoncont();
	}
	
	@Test
	
	public void verify()
	{
		home.clickonfunds();
		String actvalue = home.verifymargin();
		String expvalue = "0.00";
		
		Assert.assertEquals(actvalue, expvalue);
	}
	@AfterMethod
	public void logout(ITestResult value) throws IOException
	{
		
		
		if (value.getStatus()==ITestResult.FAILURE)
		{
			utility_class.takescreenshot(driver, TCID);
		}
	}
	
	@AfterClass
	public void closebowser()
	{
		driver.close();
		
		login1=null;
		login2=null;
		home=null;
		
	}
	
	
	
}

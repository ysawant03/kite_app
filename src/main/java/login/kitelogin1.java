package login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1 {

	
	@FindBy (xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public kitelogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterusername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickonsubmit()
	{
		
	login.click();	
	
	}
}

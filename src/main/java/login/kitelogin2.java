package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 {

	@FindBy (xpath = "//input[@id='pin']")private WebElement pin;
	 @FindBy (xpath = "//button[@type='submit']")private WebElement cont;
	
	
	public kitelogin2(WebDriver driver) 
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	public  void enterpin(String PIN)
	{
		
		pin.sendKeys(PIN);
	}
	
	public void clickoncont()
	{
		cont.click();
	}
	
	
	
}

package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehome {

	
	@FindBy(xpath="//span[text()='Funds']") private WebElement funds;
	@FindBy(xpath="//h1[@class='value']") private WebElement margin;
	
	
	public kitehome(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickonfunds() {
		
		funds.click();
	}
	
	public String verifymargin() 
	{
		
	return margin.getText();
	
	
	}
	
	
	
}

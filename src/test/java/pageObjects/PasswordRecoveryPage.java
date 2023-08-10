package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordRecoveryPage extends BasePage{

	public PasswordRecoveryPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='Password recovery']") WebElement Msg_Pass_Recovery;
	
	//Action:
	 public boolean pswd_Recovery_Msg_Displayed()
	 {
		 Msg_Pass_Recovery.isDisplayed();
		 return true;
	 }

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='My account - Change password']") WebElement Heading_Change_Password;
	
	//Action:
	 public boolean  heading_Change_Password_Msg_Displayed()
	 {
		 Heading_Change_Password.isDisplayed();
		 return true;
	 }

}

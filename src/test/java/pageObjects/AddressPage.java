package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage{

	public AddressPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='My account - Addresses']") WebElement Heading_address;
	
	//Action:
	 public boolean heading_address_Msg_Displayed()
	 {
		 Heading_address.isDisplayed();
		 return true;
	 }

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoustomerInfoPage extends BasePage{

	public CoustomerInfoPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='My account - Customer info']") WebElement Heading_customerinfo;
	
	//Action:
	 public boolean heading_customerInfo_Msg_Displayed()
	 {
		 Heading_customerinfo.isDisplayed();
		 return true;
	 }

}

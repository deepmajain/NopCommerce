package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StockSubscriptionPage extends BasePage{

	public StockSubscriptionPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//a[normalize-space()='Back in stock subscriptions'] ") WebElement Heading_Stock_Subscription;
	
	//Action:
	 public boolean  heading_Stock_Subscription_Msg_Displayed()
	 {
		 Heading_Stock_Subscription.isDisplayed();
		 return true;
	 }

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage{

	public OrderPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='My account - Orders']") WebElement Heading_order;
	
	//Action:
	 public boolean heading_order_Msg_Displayed()
	 {
		 Heading_order.isDisplayed();
		 return true;
	 }

}

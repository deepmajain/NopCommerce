package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//method:
	@FindBy(xpath="//input[@id='termsofservice']") WebElement Check_box_select_trmNCondition;
	@FindBy(xpath="//button[@id='checkout']") WebElement Btn_checkout;
	//Action:
	
	public void click_On_checkbox_termNCondition()
	{
		Check_box_select_trmNCondition.click();
	}
	
	public void click_On_Btn_CheckOut()
	{
		Btn_checkout.click();
	}
   }

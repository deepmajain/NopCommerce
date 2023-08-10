package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//method:
	@FindBy(xpath="//h1[normalize-space()='Search']") WebElement MsgHeadingSearchPage;
	@FindBy(xpath="//div[@class='product-item']//img[@title='Show details for Apple MacBook Pro 13-inch']") WebElement link_Poduct;
	@FindBy(xpath="//button[@id='add-to-cart-button-4']") WebElement btn_AddToCart;
	@FindBy(xpath="//p[@class='content']") WebElement MSg_Sussessfully_Add_Item;
	//Action:
	
	public boolean search_Is_Displayed()
	{
		MsgHeadingSearchPage.isDisplayed();
		return true;
	}
	
	public void click_on_ProductItem()
	{
		link_Poduct.click();
	}
    public void click_on_Btn_AddToCart()
    {
    	btn_AddToCart.click();
    }
    public boolean Msg_successFully_ItemAdded_intocart()
    {
    	MSg_Sussessfully_Add_Item.isDisplayed();
    	return true;
    	
    }
}

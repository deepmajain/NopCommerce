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
	@FindBy(xpath="//div[@class='product-item']//img[@title='Show details for Apple MacBook Pro 13-inch']") WebElement Link_Poduct;
	@FindBy(xpath="//button[@id='add-to-cart-button-4']") WebElement Btn_AddToCart;
	@FindBy(xpath="//p[@class='content']") WebElement MSg_Sussessfully_Add_Item;
	//Action:
	
	public boolean search_Is_Displayed()
	{
		MsgHeadingSearchPage.isDisplayed();
		return true;
	}
	
	public void click_on_ProductItem()
	{
		Link_Poduct.click();
	}
    public void click_on_Btn_AddToCart()
    {
    	Btn_AddToCart.click();
    }
    public boolean msg_successFully_ItemAdded_intocart()
    {
    	MSg_Sussessfully_Add_Item.isDisplayed();
    	return true;
    	
    }
}

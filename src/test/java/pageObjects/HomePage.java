package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//locator:
	 @FindBy(xpath="//a[normalize-space()='Register']")
	 WebElement link_register;
	 
	 @FindBy(xpath="//a[normalize-space()='Log in']") public
	 WebElement link_Login;
	 
	 @FindBy(xpath="//a[@class='ico-account']") 
	 WebElement link_MyAccount;
	 
	 @FindBy(xpath="//input[@id='small-searchterms']") 
	 WebElement text_search_box;
	 
	 @FindBy(xpath="//button[normalize-space()='Search']") 
	 WebElement Btn_Search;
	 
	 @FindBy(xpath="//span[@class='cart-label']") 
	 WebElement Btn_shopping_cart;
	 
	 
	
	 
	 
	//action:
	 public void click_Registration()
	 {
		 link_register.click();
	 }
	 
	 public void click_Login()
	 {
		 link_Login.click();
	 }
	 
	 public void click_Myaccount()
	 {
		 link_MyAccount.click();
	 }
	 
	 public void Text_Search_iteam()
	 {
		 text_search_box.sendKeys("laptop");
		
	 }
	 public void click_Search_btn()
	 {
		 Btn_Search.click();
	 }
	 
	 public void click_ShoppingCart_btn()
	 {
		 Btn_shopping_cart.click();
	 }
	
	


}

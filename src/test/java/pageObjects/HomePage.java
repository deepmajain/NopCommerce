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
	 WebElement Link_register;
	 
	 @FindBy(xpath="//a[normalize-space()='Log in']") public
	 WebElement Link_Login;
	 
	 @FindBy(xpath="//a[@class='ico-account']") 
	 WebElement Link_MyAccount;
	 
	 @FindBy(xpath="//input[@id='small-searchterms']") 
	 WebElement Text_search_box;
	 
	 @FindBy(xpath="//button[normalize-space()='Search']") 
	 WebElement Btn_Search;
	 
	 @FindBy(xpath="//span[@class='cart-label']") 
	 WebElement Btn_Shopping_cart;
	 
	 
	
	 
	 
	//action:
	 public void click_Registration()
	 {
		 Link_register.click();
	 }
	 
	 public void click_Login()
	 {
		 Link_Login.click();
	 }
	 
	 public void click_Myaccount()
	 {
		 Link_MyAccount.click();
	 }
	 
	 public void Text_Search_iteam()
	 {
		 Text_search_box.sendKeys("laptop");
		
	 }
	 public void click_Search_btn()
	 {
		 Btn_Search.click();
	 }
	 
	 public void click_ShoppingCart_btn()
	 {
		 Btn_Shopping_cart.click();
	 }
	
	


}

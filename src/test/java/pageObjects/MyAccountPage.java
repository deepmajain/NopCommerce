package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);

	}
	
	//Locators:
	
	@FindBy(xpath="//a[@class='ico-account']") WebElement link_Myaccount;
	
	@FindBy(xpath="//input[@id='Newsletter']") WebElement CheckBox_newslatter;
	
	@FindBy(xpath="//a[normalize-space()='Customer info']") WebElement link_coustomerinfo;
	@FindBy(xpath="//a[normalize-space()='Addresses']") WebElement link_Address;
	@FindBy(xpath="//a[normalize-space()='Orders']") WebElement link_orders;
	@FindBy(xpath="//a[normalize-space()='Downloadable products']") WebElement link_downloadable_product;
	@FindBy(xpath="//a[normalize-space()='Back in stock subscriptions']") WebElement link_back_in_stock_subscription;
	@FindBy(xpath="//a[normalize-space()='Reward points']") WebElement link_rewards_point;
	@FindBy(xpath="//a[normalize-space()='Change password']") WebElement link_change_password;
	@FindBy(xpath="//a[normalize-space()='My product reviews']") WebElement link_myProduct_review;
	
	@FindBy(xpath="//div[@class='block block-account-navigation']//strong[contains(text(),'My account')]") WebElement Heading_myaccount;
	@FindBy(xpath="//a[normalize-space()='Log out']") WebElement link_Logout;
	
	
	//action
	
	public String Get_Text_MyAccount()
	{
		return(link_Myaccount.getText());
	}
	
	public void news_letter_chkbox_isSelctedOrNot()
	{
		CheckBox_newslatter.isSelected();
	}
	
	//action methods for links
	
	public void Click_coustomerinfo()
	{
		link_coustomerinfo.click();
	}
	public void Click_Address()
	{
		link_Address.click();
	}
	public void Click_Orders()
	{
		link_orders.click();
	}
	public void Click_downladable_product()
	{
		link_downloadable_product.click();
	}
	public void Click_back_in_stock_subscription()
	{
		link_back_in_stock_subscription.click();
	}
	public void Click_reward_points()
	{
		link_rewards_point.click();
	}
	
	public void Click_change_password()
	{
		link_change_password.click();
	}
	public void Click_myProduct_review()
	{
		link_myProduct_review.click();
	}
	
	//action method for heading validation
	
	public boolean Heading_myaccount_isdisplayed()
	{
		Heading_myaccount.isDisplayed();
		return true;
	}
	
	public void Click_logout()
	{
		link_Logout.click();
	}

}

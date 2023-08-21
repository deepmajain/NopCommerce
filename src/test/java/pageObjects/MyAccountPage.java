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
	
	@FindBy(xpath="//a[@class='ico-account']") WebElement Link_Myaccount;
	
	@FindBy(xpath="//input[@id='Newsletter']") WebElement CheckBox_newslatter;
	
	@FindBy(xpath="//a[normalize-space()='Customer info']") WebElement Link_coustomerinfo;
	@FindBy(xpath="//a[normalize-space()='Addresses']") WebElement Link_Address;
	@FindBy(xpath="//a[normalize-space()='Orders']") WebElement Link_orders;
	@FindBy(xpath="//a[normalize-space()='Downloadable products']") WebElement Link_downloadable_product;
	@FindBy(xpath="//a[normalize-space()='Back in stock subscriptions']") WebElement Link_back_in_stock_subscription;
	@FindBy(xpath="//a[normalize-space()='Reward points']") WebElement Link_rewards_point;
	@FindBy(xpath="//a[normalize-space()='Change password']") WebElement Link_change_password;
	@FindBy(xpath="//a[normalize-space()='My product reviews']") WebElement Link_myProduct_review;
	
	@FindBy(xpath="//div[@class='block block-account-navigation']//strong[contains(text(),'My account')]") WebElement Heading_myaccount;
	@FindBy(xpath="//a[normalize-space()='Log out']") WebElement Link_Logout;
	
	
	//action
	
	public String get_Text_MyAccount()
	{
		return(Link_Myaccount.getText());
	}
	
	public void news_letter_chkbox_isSelctedOrNot()
	{
		CheckBox_newslatter.isSelected();
	}
	
	//action methods for links
	
	public void click_coustomerinfo()
	{
		Link_coustomerinfo.click();
	}
	public void click_Address()
	{
		Link_Address.click();
	}
	public void click_Orders()
	{
		Link_orders.click();
	}
	public void click_downladable_product()
	{
		Link_downloadable_product.click();
	}
	public void click_back_in_stock_subscription()
	{
		Link_back_in_stock_subscription.click();
	}
	public void click_reward_points()
	{
		Link_rewards_point.click();
	}
	
	public void click_change_password()
	{
		Link_change_password.click();
	}
	public void click_myProduct_review()
	{
		Link_myProduct_review.click();
	}
	
	//action method for heading validation
	
	public boolean heading_myaccount_isdisplayed()
	{
		Heading_myaccount.isDisplayed();
		return true;
	}
	
	public void click_logout()
	{
		Link_Logout.click();
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) 
	{
		super(driver);

	}
	
	//locator:
	

	@FindBy(xpath="//input[@id='Email']")public WebElement Text_Email;
	@FindBy(xpath="//input[@id='Password']")public WebElement Text_Password;
	@FindBy(xpath="//button[normalize-space()='Log in']")public WebElement Btn_Login;
	@FindBy(xpath="//button[normalize-space()='Register']")WebElement Btn_Register;
	@FindBy(xpath="//a[normalize-space()='Forgot password?']") WebElement Link_ForgotPass;
	@FindBy(xpath="//a[normalize-space()='Log out']")WebElement Link_logout;
	
	
	//All labels locators:
	
	
	@FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")WebElement Label_welcome_signin;
	@FindBy(xpath="//strong[normalize-space()='New Customer']")WebElement Label_New_Customer;
	@FindBy(xpath="//strong[normalize-space()='Returning Customer']")WebElement Label_returing_customer;
	@FindBy(xpath="//label[normalize-space()='Email:']")WebElement Label_Email;
	@FindBy(xpath="//label[normalize-space()='Password:']")WebElement Label_pass;
	@FindBy(xpath="//label[normalize-space()='Remember me?']")WebElement Label_rememberme;
	@FindBy(xpath="//h2[normalize-space()='About login / registration']") WebElement Label_Aboutlogin;
	
	//Error message locators:
	
	@FindBy(xpath="//span[@id='Email-error']")WebElement Error_Msg_Email;
	@FindBy(xpath="//div[@class='message-error validation-summary-errors']") WebElement Error_Msg_Invalid_Pass;
	@FindBy(xpath="//p[@class='content']") WebElement Msg_Browsing_Back;
	
	
	
	//action
    
	public void setEmail(String email)
	{
		Text_Email.sendKeys(email);
	}
	public void setPassword(String pass)
	{
		Text_Password.sendKeys(pass);
	}
	public void click_Btn_login()
	{
		Btn_Login.click();

	}
	public void click_Btn_Register()
	{
		Btn_Register.click();
		
	}
	public void click_link_forgotpass()
	{
		Link_ForgotPass.click();
	}
	
	public void click_logout()
	{
		Link_logout.click();
	}
	
	
	//action method for all label check to displayed or not
	public boolean page_Heading_dispalyed()
	{
		Label_welcome_signin.isDisplayed();
		return true;
		
	}
	
	public boolean All_label_dispalyed()
	{
		Label_welcome_signin.isDisplayed();
		Label_New_Customer.isDisplayed();
		Label_returing_customer.isDisplayed();
		Label_Email.isDisplayed();
		Label_pass.isDisplayed();
		Label_rememberme.isDisplayed();
		Label_Aboutlogin.isDisplayed();
		return true;
		
	}
	
	
	//action method for error message
	public boolean email_Error_Msg_Displayed()
	{
		Error_Msg_Email.isDisplayed();
		return true;
	}
	public boolean pass_Error_Msg_Displayed()
	{
		Error_Msg_Invalid_Pass.isDisplayed();
		return true;
	}
	public boolean msg_Browsing_Back_Displayed()
	{
		Msg_Browsing_Back.isDisplayed();
		return true;
	}
	
	
}

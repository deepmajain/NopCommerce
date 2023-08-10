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
	@FindBy(xpath="//a[normalize-space()='Forgot password?']") WebElement link_ForgotPass;
	@FindBy(xpath="//a[normalize-space()='Log out']")WebElement link_logout;
	
	
	//All labels locators:
	
	
	@FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")WebElement label_welcome_signin;
	@FindBy(xpath="//strong[normalize-space()='New Customer']")WebElement label_New_Customer;
	@FindBy(xpath="//strong[normalize-space()='Returning Customer']")WebElement label_returing_customer;
	@FindBy(xpath="//label[normalize-space()='Email:']")WebElement label_Email;
	@FindBy(xpath="//label[normalize-space()='Password:']")WebElement label_pass;
	@FindBy(xpath="//label[normalize-space()='Remember me?']")WebElement label_rememberme;
	@FindBy(xpath="//h2[normalize-space()='About login / registration']") WebElement label_Aboutlogin;
	
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
	public void Click_Btn_login()
	{
		Btn_Login.click();

	}
	public void click_Btn_Register()
	{
		Btn_Register.click();
		
	}
	public void click_link_forgotpass()
	{
		link_ForgotPass.click();
	}
	
	public void click_logout()
	{
		link_logout.click();
	}
	
	
	//action method for all label check to displayed or not
	public boolean All_label_dispalyed()
	{
		label_welcome_signin.isDisplayed();
		label_New_Customer.isDisplayed();
		label_returing_customer.isDisplayed();
		label_Email.isDisplayed();
		label_pass.isDisplayed();
		label_rememberme.isDisplayed();
		label_Aboutlogin.isDisplayed();
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

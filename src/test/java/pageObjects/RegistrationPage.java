package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver)
	
	{
		super(driver);

	}
	
	//locators:
	@FindBy(xpath="//input[@id='gender-male']") public WebElement  Select_male_radio;
	@FindBy(xpath="//input[@id='gender-female']") public WebElement Select_female_radio;
	@FindBy(xpath="//input[@id='FirstName']") public WebElement Text_fname;
	@FindBy(xpath="//input[@id='LastName']")public WebElement Text_Lname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")public WebElement Select_DOB_Day;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")public WebElement Select_DOB_Month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")public WebElement Select_DOB_Year;
	@FindBy(xpath="//input[@id='Email']")public WebElement Text_Email;
	@FindBy(xpath="//input[@id='Company']") public WebElement Text_Company;
	@FindBy(xpath="//input[@id='Newsletter']")public WebElement Select_Newsletter;
	@FindBy(xpath="//input[@id='Password']")public WebElement Text_password;
	@FindBy(xpath="//input[@id='ConfirmPassword']")public WebElement Text_Conf_password;
	@FindBy(xpath="//button[@id='register-button']") public WebElement Btn_register;
	@FindBy(xpath="//div[@class='result']") WebElement Validation_register;
	
	//error msg locator:
	@FindBy(xpath="//span[@id='FirstName-error']") WebElement Fname_error_msg;
	@FindBy(xpath="//span[@id='LastName-error']") WebElement Lname_error_msg;
	@FindBy(xpath="//span[@id='Email-error']") WebElement Email_error_msg;
	@FindBy(xpath="//span[@id='Password-error']") WebElement Password_error_msg;
	@FindBy(xpath="//span[@id='ConfirmPassword-error']") WebElement ConfPassword_error_msg;
	@FindBy(xpath="//li[normalize-space()='must have at least 6 characters']")WebElement Pass_have6_ltter_error_msg;
	@FindBy(xpath="//span[@data-valmsg-for='ConfirmPassword']")WebElement ConPass_Donot_Match_Error_msg;
	@FindBy(xpath="//li[normalize-space()='The specified email already exists']") WebElement Email_exist_error;
	
	//Mandatory field locator:
	@FindBy(id="FirstName") WebElement Fname_star;
	@FindBy(id="LastName") WebElement Lname_star;
	@FindBy(id="Email") WebElement Email_star;
	@FindBy(id="Password") WebElement Pswd_star;
	@FindBy(id="ConfirmPassword") WebElement ConPswd_star;
	
	//labels locators:
	
	@FindBy(xpath="//h1[normalize-space()='Register']")public WebElement Label_register;
	@FindBy(xpath="//strong[normalize-space()='Your Personal Details']")WebElement Label_Personal_Deatil;
	@FindBy(xpath="//label[normalize-space()='Gender:']") WebElement Label_gender;
	@FindBy(xpath="//label[normalize-space()='Male']") WebElement Label_male;
	@FindBy(xpath="//label[normalize-space()='Female']") WebElement Label_Female;
	@FindBy(xpath="//label[normalize-space()='First name:']")WebElement Label_Fanme;
	@FindBy(xpath="//label[normalize-space()='Last name:']") WebElement Label_Lname;
	@FindBy(xpath="//label[normalize-space()='Date of birth:']") WebElement Lebel_DOB;
	@FindBy(xpath="//label[normalize-space()='Email:']")WebElement Label_email;
	@FindBy(xpath="//strong[normalize-space()='Company Details']") WebElement Label_Company_detail;
	@FindBy(xpath="//label[normalize-space()='Company name:']") WebElement Label_Company_name;
	@FindBy(xpath="//strong[normalize-space()='Options']") WebElement Label_option;
	@FindBy(xpath="//label[normalize-space()='Newsletter:']")WebElement Label_newsletter;
	@FindBy(xpath="//strong[normalize-space()='Your Password']") WebElement Label_YourPassword;
	@FindBy(xpath="//label[normalize-space()='Password:']") WebElement Label_Password;
	@FindBy (xpath="//label[normalize-space()='Confirm password:']") WebElement Label_ConfPassword;
	
	//Action
	
	public void select_Male()
	{   
		Select_male_radio.click();
	}
	
	public void select_Female()
	{
		Select_female_radio.click();
	}
    
	public void text_Fname(String fname)
	{
		Text_fname.sendKeys(fname);
	}
	public void text_Lname(String Lname)
	{
		Text_Lname.sendKeys(Lname);
	}
	public void select_DOB(String day,String month,String year)
	{
		Select_DOB_Day.sendKeys(day);
		Select_DOB_Month.sendKeys(month);
		Select_DOB_Year.sendKeys(year);
	}
	
	public void set_Email(String email)
	{
		Text_Email.sendKeys(email);
	}
	public void Set_Company(String cname)
	{
		Text_Company.sendKeys(cname);
	}
	public void select_Newsletter() 
	{
		Select_Newsletter.click();
	}
	public void set_password()
	{
		Text_password.sendKeys("abc123");
	}
	public void set_ConPassword()
	{
		Text_Conf_password.sendKeys("abc123");
	}
	public void click_Btn_Register()
	{
		Btn_register.click();
	}
	public boolean register_is_displayed()
	{
		Validation_register.isDisplayed();
		return true;
	}
	
	//error msg methods
	
	public boolean fname_error_msg_displayed()
	{
		Fname_error_msg.isDisplayed();
		return true;
	}
	public boolean lname_error_msg_displayed()
	{
		Lname_error_msg.isDisplayed();
		return true;
	}
	
	public boolean email_error_msg_displayed()
	{
		Email_error_msg.isDisplayed();
		return true;
	}
	public boolean password_error_msg_displayed()
	{
		Password_error_msg.isDisplayed();
		return true;
	}
	public boolean confPassword_error_msg_displayed()
	{
		ConfPassword_error_msg.isDisplayed();
		return true;
	}
	public boolean pass_hve6ltter_error_msg_displayed()
	{
		Pass_have6_ltter_error_msg.isDisplayed();
		return true;	
     }
	public boolean confPass_donot_match_error_msg_displayed()
	{
		ConPass_Donot_Match_Error_msg.isDisplayed();
	    return true;
	}
	
	public boolean email_already_exist()
	{
		Email_exist_error.isDisplayed();
		return true;
	} 
	
	public boolean fname_star_momdatory_exsits()
	{
		String actualcolur= Fname_star.getCssValue("color");
		System.out.print(actualcolur);
		String expextedcolour="rgba(119, 119, 119, 1)";
		Assert.assertEquals(actualcolur,expextedcolour);
		Fname_star.isDisplayed();
		return true;
	}
	public boolean lname_star_momdatory_exsits()
	{
		String actualcolur= Lname_star.getCssValue("color");
		System.out.print(actualcolur);
		String expextedcolour="rgba(119, 119, 119, 1)";
		Assert.assertEquals(actualcolur,expextedcolour);
		Lname_star.isDisplayed();
		return true;
	}

	public boolean email_star_momdatory_exsits()
	{
		String actualcolur= Email_star.getCssValue("color");
		System.out.print(actualcolur);
		String expextedcolour="rgba(119, 119, 119, 1)";
		Assert.assertEquals(actualcolur,expextedcolour);
		Email_star.isDisplayed();
		return true;
	}

	public boolean password_star_momdatory_exsits()
	{
		String actualcolur= Pswd_star.getCssValue("color");
		System.out.print(actualcolur);
		String expextedcolour="rgba(119, 119, 119, 1)";
		Assert.assertEquals(actualcolur,expextedcolour);
		Pswd_star.isDisplayed();
		return true;
	}

	public boolean confpass_star_momdatory_exsits()
	{
		String actualcolur= ConPswd_star.getCssValue("color");
		System.out.print(actualcolur);
		String expextedcolour="rgba(119, 119, 119, 1)";
		Assert.assertEquals(actualcolur,expextedcolour);
		ConPswd_star.isDisplayed();
		return true;
	}
	
	//single action method  for all labels
	
	public boolean all_Label_RegistarionPage_IsDisplayed()
	{
		Label_register.isDisplayed();
		Label_Personal_Deatil.isDisplayed();
		Label_gender.isDisplayed();
		Label_male.isDisplayed();
		Label_Female.isDisplayed();
		Label_email.isDisplayed();
		Label_Company_detail.isDisplayed();
		Label_Company_name.isDisplayed();
		Label_option.isDisplayed();
		Label_newsletter.isDisplayed();
		Label_YourPassword.isDisplayed();
		Label_Password.isDisplayed();
		Label_ConfPassword.isDisplayed();
		return true;
	}

}
  
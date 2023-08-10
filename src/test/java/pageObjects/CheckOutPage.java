package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//method billing Add:
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']") WebElement Text_Fname;
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']") WebElement Text_Lname;
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']") WebElement Text_Email;
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']") WebElement Text_Company_Name;
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']") WebElement Text_Country_Name;
	@FindBy(xpath="//input[@id='BillingNewAddress_City']") WebElement Text_city;
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']") WebElement Text_Add;
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']") WebElement Text_Postal;
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']") WebElement Text_Phone;
	
	//Shipping Add
	
	@FindBy(xpath="//button[@onclick='Billing.save()']") WebElement Btn_Billing_Continue;
	//Action:
	
	
	public void set_Fname( String fname)
	{
		Text_Fname.clear();
		Text_Fname.sendKeys(fname);
	}
	public void set_Lname(String lname)
	{
		Text_Lname.clear();
		Text_Lname.sendKeys(lname);
	}
   
	public void set_Email(String email)
	{
		Text_Email.clear();
		Text_Email.sendKeys(email);
	}
   
	public void set_Company_name(String company)
	{
		Text_Company_Name.clear();
		Text_Company_Name.sendKeys(company);
	}
   
	public void set_Country_Name(String country)
	{
		Text_Country_Name.sendKeys(country);
	}
   
	public void set_City(String city)
	{
		Text_city.sendKeys(city);
	}
	public void set_Add(String add)
	{
		Text_city.sendKeys(add);
	}
   
   
	public void set_Postal_Code(String postal)
	{
		Text_Postal.sendKeys(postal);
	}
	public void set_Phone(String phone)
	{
		Text_Phone.sendKeys(phone);
	}
   
   
		public void click_on_btnContinue_Billing()
	{
		Btn_Billing_Continue.click();
	}
   
}

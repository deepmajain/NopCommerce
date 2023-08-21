package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//h1[normalize-space()='My account - Change password']") WebElement Heading_Change_Password;
	@FindBy(xpath="//input[@id='OldPassword']") WebElement Text_OldPass;
	@FindBy(xpath="//input[@id='NewPassword']") WebElement Text_NewPass;
	@FindBy(xpath="//input[@id='ConfirmNewPassword']") WebElement Text_ConfPass;
	@FindBy(xpath="//button[normalize-space()='Change password']") WebElement Btn_ChangePass;
	@FindBy(xpath="//span[@title='Close']") WebElement Close_btn_pswd_changed_msg;
	
	//Action:
	 public boolean  heading_Change_Password_Msg_Displayed()
	 {
		 Heading_Change_Password.isDisplayed();
		 return true;
	 }
	 public void text_old_pass(String oldpass)
	 {
		Text_OldPass.sendKeys(oldpass);
		 
	 }
	 public void set_new_pass(String newpass)
	 {
		 Text_NewPass.sendKeys(newpass);
	 }
	 public void set_conf_pass(String confpass)
	 {
		 Text_ConfPass.sendKeys(confpass);
	 }

	 public void click_change_pass()
	 {
		 Btn_ChangePass.click();
	 }
	 public void click_Close_btn_pawd_changed_msg()
	 {
		 Close_btn_pswd_changed_msg.click();
	 }



}

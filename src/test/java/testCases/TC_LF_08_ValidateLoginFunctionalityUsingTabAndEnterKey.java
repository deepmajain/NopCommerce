package testCases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LF_08_ValidateLoginFunctionalityUsingTabAndEnterKey extends BaseClass 
	{
	@Test
	public void login()
	{
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.Text_Email.sendKeys(Keys.TAB);
		lp.setEmail(rb.getString("Email"));
		lp.Text_Email.sendKeys(Keys.TAB);
		lp.setPassword(rb.getString("pass"));
		lp.Btn_Login.sendKeys(Keys.TAB);
		lp.Btn_Login.sendKeys(Keys.ENTER);
		MyAccountPage map=new MyAccountPage(driver);
		Assert.assertEquals(map.Get_Text_MyAccount(),"My account");
		
	}
	
	}

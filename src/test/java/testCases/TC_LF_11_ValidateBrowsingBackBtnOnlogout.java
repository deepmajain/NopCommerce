package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_11_ValidateBrowsingBackBtnOnlogout extends BaseClass 
	{
	@Test
	public void login()
	{
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		lp.setPassword(rb.getString("pass"));
		lp.Click_Btn_login();
		lp.click_logout();  
		driver.navigate().back();
		Assert.assertEquals(hp.link_Login.isDisplayed(),true);
		
	}
	
	}

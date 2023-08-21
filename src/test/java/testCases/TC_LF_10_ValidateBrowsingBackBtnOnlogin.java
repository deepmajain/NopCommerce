package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_10_ValidateBrowsingBackBtnOnlogin extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
	    logger.info("***************TC_LF_10_Start*********************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login button");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		logger.info("Enter email id");
		lp.setPassword(rb.getString("pass"));
		logger.info("Enter password");
		lp.click_Btn_login();
		logger.info("click on login button");
		driver.navigate().back();
		logger.info("driver nevigate to back page in login page");
		Assert.assertEquals(lp.msg_Browsing_Back_Displayed(),true);
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		logger.info("***************TC_LF_10_Finish*********************************");
	}
	
	}

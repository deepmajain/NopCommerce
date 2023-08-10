package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PasswordRecoveryPage;
import testBase.BaseClass;

public class TC_LF_03_validateForgotPassLink extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
			logger.info("********************TC_LF_03_Start*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.click_link_forgotpass();
		PasswordRecoveryPage prp=new PasswordRecoveryPage(driver);
		Assert.assertEquals(prp.pswd_Recovery_Msg_Displayed(),true);
		}
		catch(Exception e)
		{
			logger.info("********************TC_LF_03_Finish*****************************");}
	}
	
	}

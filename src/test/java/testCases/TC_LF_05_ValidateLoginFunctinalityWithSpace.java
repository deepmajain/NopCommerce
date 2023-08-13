package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_05_ValidateLoginFunctinalityWithSpace extends BaseClass
	{
	@Test
	 public void login()
	 {
		try
		{
		logger.info("***********************TC_LF_05_Strat*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.Click_Btn_login();
		logger.info("click on login button");
		Assert.assertEquals(lp.email_Error_Msg_Displayed(), true,"please enter eamil id");
		logger.info("user should not get enter with spaces: Error msg dispalyed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_05__Finish***********************");
	 }
	}

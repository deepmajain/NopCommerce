package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_06_ValidateLoginFunctinalityWithWeongEmail extends BaseClass
	{
	@Test
	 public void login()
	 {
		try
		{
			logger.info("***********************TC_LF_06_Strat*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("sddf");
		lp.Click_Btn_login();
		Assert.assertEquals(lp.email_Error_Msg_Displayed(), true,"wrong Email");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_06__Finish***********************");
	 }
	}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_06_ValidateLoginFunctinalityWithWrongEmail extends BaseClass
	{
	@Test
	 public void login()
	 {
		try
		{
		logger.info("***********************TC_LF_06_Strat*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail("sddf");
		lp.click_Btn_login();
		logger.info("click on login button");
		Assert.assertEquals(lp.email_Error_Msg_Displayed(), true,"wrong Email");
		logger.info("Error msg should displayed: wrong Email id");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_06__Finish***********************");
	 }
	}

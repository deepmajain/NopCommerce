package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_07_ValidateLoginFunctinalityWithValidEmailAndWrongPass extends BaseClass
	{
	@Test
	 public void login()
	 {
		try
		{
		logger.info("***********************TC_LF_07_Strat*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		logger.info("Enter valid Email id");
		lp.setPassword("12");
		logger.info("Enter invalid password");
		lp.click_Btn_login();
		logger.info("click on login button");
		Assert.assertEquals(lp.pass_Error_Msg_Displayed(), true,"wrong Email");
		logger.info("Error msg should displayed: wrong Email id");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_07__Finish***********************");
	 }
	}

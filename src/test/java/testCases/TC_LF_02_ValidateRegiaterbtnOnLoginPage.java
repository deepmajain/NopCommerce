package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_LF_02_ValidateRegiaterbtnOnLoginPage extends BaseClass
	{
	@Test
	 public void login()
	 {
		try 
		{
			logger.info("******************************TC_LF_02_Start***********************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.click_Btn_Register();
		RegistrationPage rp=new RegistrationPage(driver);
		Assert.assertEquals(rp.Label_register.getText(),"Register");	
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("******************************TC_LF_02_Finish***********************");
	 }
	}

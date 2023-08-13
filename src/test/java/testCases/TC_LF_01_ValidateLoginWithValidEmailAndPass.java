package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_01_ValidateLoginWithValidEmailAndPass extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
		logger.info("*****************TC_LF_01 Start*******************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		logger.info("Set Email id");
		lp.setPassword(rb.getString("pass"));
		logger.info("Set password");
		lp.Click_Btn_login();
		logger.info("click on login button");
		}
			catch(Exception e)
			{
				Assert.fail();
			}
		logger.info("*****************TC_LF_01_Finish*******************");
		}
	}
	
	

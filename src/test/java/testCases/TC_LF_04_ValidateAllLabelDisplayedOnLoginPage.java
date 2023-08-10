package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_04_ValidateAllLabelDisplayedOnLoginPage extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
			logger.info("*************************TC_LF_04_Start*******************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals(lp.All_label_dispalyed(), true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*************************TC_LF_04_Finish*************");
		
	}
	}

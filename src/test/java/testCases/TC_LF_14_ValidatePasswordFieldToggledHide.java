package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_14_ValidatePasswordFieldToggledHide extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
			 logger.info("***************TC_LF_14_Start*********************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		Assert.assertEquals(lp.Text_Password.getAttribute("type"),"password");
		logger.info("Enter password: which should be toggle hide");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		 logger.info("***************TC_LF_14_Finish*********************************");
		
	}
	
	}

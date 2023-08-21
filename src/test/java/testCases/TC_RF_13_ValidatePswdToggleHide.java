package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_13_ValidatePswdToggleHide extends BaseClass
	{
	@Test
	 public void Registation()
	 {
		try
		{
	     logger.info("***********************TC_RF_TC_13_Start********************");
		 HomePage hp=new HomePage(driver);
		 hp.click_Registration();
		 RegistrationPage rp=new RegistrationPage(driver);
		Assert.assertEquals(rp.Text_password.getAttribute("type"),"password");
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_RF_TC_13_Start********************");
	 }
	}

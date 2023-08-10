package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_06_PassConfPassDoNotMatchd extends BaseClass
	{
	@Test
	 public void registration()
	 {
		try
		{
		HomePage hp=new HomePage(driver);
		hp.click_Registration();
		RegistrationPage rp=new RegistrationPage(driver);
		rp.set_password();
		rp.text_Conf_password.sendKeys("121");
		rp.click_Btn_Register();
		Assert.assertEquals(rp.confPass_donot_match_error_msg_displayed(),true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	 }
	}


package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_03_registerWithoutFillUpDetail extends BaseClass
	{
	@Test(priority=1)
	  public void registration()
	  {
		try
		{
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  RegistrationPage rp=new RegistrationPage(driver); 
		  rp.click_Btn_Register();
		  assertEquals(rp.fname_error_msg_displayed(),true);
		  assertEquals(rp.lname_error_msg_displayed(),true);
		  assertEquals(rp.email_error_msg_displayed(),true);
		  assertEquals(rp.password_error_msg_displayed(),true);
		  assertEquals(rp.confPassword_error_msg_displayed(),true);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	
	  }
	
	}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_04_validateRegWithInvalidEmail extends BaseClass
	{
	
	@Test(priority=1)
	  public void registration()
	  {
		try
		{
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.set_Email(randomeString());
		  rp.click_Btn_Register();
		 Assert.assertEquals(rp.email_error_msg_displayed(),true,"wrong Email id");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	  }
	
	
	}

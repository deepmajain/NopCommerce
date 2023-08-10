package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_02_RegisterWithMandatoryField extends BaseClass
	{
	@Test(priority=1)
	  public void registration()
	  {
		try
		{
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.text_Fname(randomeString().toUpperCase());
		  rp.text_Lname(randomeString().toUpperCase());
		  rp.set_Email(randomeString()+"@gmail.com");
		  rp.set_password();
		  rp.set_ConPassword();
		  rp.click_Btn_Register();
		 Assert.assertEquals(rp.register_is_displayed(),true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	  }
	
	}

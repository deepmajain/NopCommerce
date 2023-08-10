package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_12_ValidateStarMandatoryfield extends BaseClass
 
{

	@Test
	void registraion()
	{
		try
		{
		logger.info("*************TC_RF_12_Start**********************");
		 HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  RegistrationPage rp=new RegistrationPage(driver);
		  Assert.assertEquals(rp.fname_star_momdatory_exsits(),true);
		  Assert.assertEquals(rp.lname_star_momdatory_exsits(),true);
		  Assert.assertEquals(rp.email_star_momdatory_exsits(),true);
		  Assert.assertEquals(rp.password_star_momdatory_exsits(),true);
		  Assert.assertEquals(rp.confpass_star_momdatory_exsits(),true);
		  logger.info("*************TC_RF_12_Finish**********************");
		}
		catch(Exception e) 
		{
			Assert.fail();
			
		}
	}
}

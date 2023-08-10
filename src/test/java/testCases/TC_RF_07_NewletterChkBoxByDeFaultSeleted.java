package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_07_NewletterChkBoxByDeFaultSeleted extends BaseClass
	{
	@Test
	 public void registration_chkbox_bydefault_slected()
	 {
		 logger.info("*************************TC_RF_07 Start***************************");
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		  Assert.assertTrue( rp.Select_Newsletter.isSelected());
		  logger.info(" by default news letter checkbox selected ");
		  
	 }
	
	}

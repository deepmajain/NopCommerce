package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_14_ValidateAllLabelOnRegisrationPage extends BaseClass
	{
	@Test
	 public void registration()
	 {
		logger.info("*************************TC_RF_14 Start***************************");
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		 Assert.assertEquals(rp.All_Label_RegistarionPage_IsDisplayed(),true);
		 logger.info("*************************TC_RF_14 finidht***************************");
		
	 }
	}

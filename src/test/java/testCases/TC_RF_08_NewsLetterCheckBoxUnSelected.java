package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_08_NewsLetterCheckBoxUnSelected extends BaseClass {
	@Test
	public void registration_chkbox_bydefault_slected() throws InterruptedException
	 {
		 logger.info("*************************TC_RF_08 Start***************************");
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.Select_Newsletter.click();
		  rp.Select_Newsletter.isSelected();
		  Thread.sleep(5000);
		  Assert.assertFalse( rp.Select_Newsletter.isSelected());
		  logger.info(" news letter checkbox should get un checked ");
	 }
}
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CoustomerInfoPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_01_ValidateCostomerInfoLink extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_01 Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 logger.info("clicked on login link");
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 logger.info("Enter email id");
		 lp.setPassword(rb.getString("pass"));
		 logger.info("Enter password");
		 lp.click_Btn_login();
		 logger.info("clicked on login button");
		 hp.click_Myaccount();
		 logger.info("clicked on my account");
		 MyAccountPage map=new MyAccountPage(driver);
		 map.click_coustomerinfo();
		 logger.info("clicked on coustomer information");
		 CoustomerInfoPage cip=new CoustomerInfoPage(driver);
		 Assert.assertEquals(cip.heading_customerInfo_Msg_Displayed(),true);
		 logger.info("coustomer information page displayed");
		 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("*********************TC_MAF_01_Finish_********************");
	 }
	}

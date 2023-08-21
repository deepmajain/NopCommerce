package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddressPage;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_02_ValidateAddressesLink extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_02 Start_********************");
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
		 map.click_Address();
		 logger.info("clicked on address link");
		 AddressPage add=new AddressPage(driver);
		 Assert.assertEquals(add.heading_address_Msg_Displayed(),true);
		 logger.info("Address page diaplyed");
		 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("*********************TC_MAF_02_Finish_********************");
	 }
	}

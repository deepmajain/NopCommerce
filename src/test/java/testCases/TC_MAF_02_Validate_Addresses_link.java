package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddressPage;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_02_Validate_Addresses_link extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_02 Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.Click_Address();
		 AddressPage add=new AddressPage(driver);
		 Assert.assertEquals(add.heading_address_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_02_Finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

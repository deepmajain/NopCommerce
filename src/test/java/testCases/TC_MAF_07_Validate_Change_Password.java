package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

import testBase.BaseClass;

public class TC_MAF_07_Validate_Change_Password extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_07_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.Click_change_password();
		 ChangePasswordPage cp=new ChangePasswordPage(driver);
		 Assert.assertEquals(cp.heading_Change_Password_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_07_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_09_Validate_Heading_msg extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_08_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 Assert.assertEquals(map.Heading_myaccount_isdisplayed(),true);
		 logger.info("*********************TC_MAF_08_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

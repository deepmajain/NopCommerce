package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_MAF_10_Validate_logoutFuctionality extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_10_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 lp.click_logout();
		 Assert.assertEquals(hp.link_Login.getText(),"Log in");
		 logger.info("*********************TC_MAF_10_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

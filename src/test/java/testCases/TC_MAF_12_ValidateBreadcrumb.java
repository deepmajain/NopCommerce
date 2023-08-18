package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_12_ValidateBreadcrumb extends BaseClass
	{
		@Test
		public void Myaccount()
		{
			try
			{
		     logger.info("***********************TC_MAF_12 start************************");
		    HomePage hp=new HomePage(driver);
		    hp.click_Login();
		    LoginPage lp=new LoginPage(driver);
		    lp.setEmail(rb.getString("Email"));
		    lp.setPassword(rb.getString("pass"));
		    lp.Click_Btn_login();
		    hp.click_Myaccount();
		    String url=  driver.getCurrentUrl();
		    Assert.assertEquals(url,"https://demo.nopcommerce.com/customer/info");
		    String title=driver.getTitle();
		    Assert.assertEquals(title,"nopCommerce demo store. Account");
			MyAccountPage map=new MyAccountPage(driver);
			Assert.assertEquals(map.Heading_myaccount_isdisplayed(),true);
			
			
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			logger.info("***********************TC_MAF_12 start************************");
		}
	}

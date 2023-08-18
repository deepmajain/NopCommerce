package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_19_ValidateBreadcrumb extends BaseClass
	{
		@Test
		public void Myaccount()
		{
			try
			{
		     logger.info("***********************TC_LF_19 start************************");
		    HomePage hp=new HomePage(driver);
		    hp.click_Login();
		    LoginPage lp=new LoginPage(driver);
		    String url=  driver.getCurrentUrl();
		    Assert.assertEquals(url,"https://demo.nopcommerce.com/login?returnUrl=%2F");
		    String title=driver.getTitle();
		    Assert.assertEquals(title,"nopCommerce demo store. Login");
		    Assert.assertEquals(lp.Page_Heading_dispalyed(),true);	
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			logger.info("***********************TC_LF_19 start************************");
		}
	}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_19_ValidateBreadCrumb extends BaseClass
	{
		@Test
		public void Myaccount()
		{
			try
			{
		     logger.info("***********************TC_LF_19 start************************");
		    HomePage hp=new HomePage(driver);
		    hp.click_Login();
		    logger.info("click on login button");
		    LoginPage lp=new LoginPage(driver);
		    String url=  driver.getCurrentUrl();
		    Assert.assertEquals(url,"https://demo.nopcommerce.com/login?returnUrl=%2F");
		    logger.info("url of current page is diaplayed");
		    String title=driver.getTitle();
		    Assert.assertEquals(title,"nopCommerce demo store. Login");
		    logger.info("Title of current page is diaplayed");
		    Assert.assertEquals(lp.page_Heading_dispalyed(),true);	
		    logger.info("Heading of current page is diaplayed");
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			logger.info("***********************TC_LF_19_finish************************");
		}
	}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DownloadProductPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_04_Validate_Downloadable_Product extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_04_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.Click_downladable_product();
		 DownloadProductPage op=new DownloadProductPage(driver);
		 Assert.assertEquals(op.heading_DownloadProduct_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_04_Finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

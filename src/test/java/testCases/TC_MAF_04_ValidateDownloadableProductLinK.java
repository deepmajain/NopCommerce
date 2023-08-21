package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DownloadProductPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_MAF_04_ValidateDownloadableProductLinK extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_04_Start_********************");
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
		 map.click_downladable_product();
		 logger.info("clicked dounload product link");
		 DownloadProductPage op=new DownloadProductPage(driver);
		 Assert.assertEquals(op.heading_DownloadProduct_Msg_Displayed(),true);
		 logger.info("Download page diaplyed");
		 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("*********************TC_MAF_04_Finish_********************");
	 }
	}

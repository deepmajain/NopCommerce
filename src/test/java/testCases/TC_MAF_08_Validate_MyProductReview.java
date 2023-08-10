package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.MyProductReviewPage;
import testBase.BaseClass;

public class TC_MAF_08_Validate_MyProductReview extends BaseClass
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
		 map.Click_myProduct_review();
		 MyProductReviewPage rp=new MyProductReviewPage(driver);
		 Assert.assertEquals(rp.heading_My_Product_Review_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_08_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

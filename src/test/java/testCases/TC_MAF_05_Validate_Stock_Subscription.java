package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.StockSubscriptionPage;
import testBase.BaseClass;

public class TC_MAF_05_Validate_Stock_Subscription extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_05_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.Click_back_in_stock_subscription();
		 StockSubscriptionPage op=new StockSubscriptionPage(driver);
		 Assert.assertEquals(op.heading_Stock_Subscription_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_05_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

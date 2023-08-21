package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.StockSubscriptionPage;
import testBase.BaseClass;

public class TC_MAF_05_ValidateStockubscriptionLink extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_05_Start_********************");
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
		 map.click_back_in_stock_subscription();
		 logger.info("clicked back in asock sibscription product link");
		 StockSubscriptionPage op=new StockSubscriptionPage(driver);
		 Assert.assertEquals(op.heading_Stock_Subscription_Msg_Displayed(),true);
		 logger.info("stock subscription page diaplyed");
		 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("*********************TC_MAF_05_finish_********************");
	 }
	}

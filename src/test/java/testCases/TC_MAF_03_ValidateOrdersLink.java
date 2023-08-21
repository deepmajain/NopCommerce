package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.OrderPage;
import testBase.BaseClass;

public class TC_MAF_03_ValidateOrdersLink extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_03_Start_********************");
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
		 map.click_Orders();
		 logger.info("clicked on Oeders link");
		 OrderPage op=new OrderPage(driver);
		 Assert.assertEquals(op.heading_order_Msg_Displayed(),true);
		 logger.info("Order page diaplyed"); 
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("*********************TC_MAF_03_Finish_********************");
	 }
	}

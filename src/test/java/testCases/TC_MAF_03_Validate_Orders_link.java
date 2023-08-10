package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.OrderPage;
import testBase.BaseClass;

public class TC_MAF_03_Validate_Orders_link extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_03_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.Click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.Click_Orders();
		 OrderPage op=new OrderPage(driver);
		 Assert.assertEquals(op.heading_order_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_03_Finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

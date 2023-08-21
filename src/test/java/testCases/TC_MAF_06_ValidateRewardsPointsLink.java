package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.RewardsPointPage;
import testBase.BaseClass;

public class TC_MAF_06_ValidateRewardsPointsLink extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_06_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.click_Btn_login();
		 hp.click_Myaccount();
		 MyAccountPage map=new MyAccountPage(driver);
		 map.click_reward_points();
		 RewardsPointPage RPP=new RewardsPointPage(driver);
		 Assert.assertEquals(RPP.heading_Rewards_points_Msg_Displayed(),true);
		 logger.info("*********************TC_MAF_06_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

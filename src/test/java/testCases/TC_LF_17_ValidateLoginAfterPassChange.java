package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LF_17_ValidateLoginAfterPassChange extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
	    logger.info("***************TC_LF_17_Start*********************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login button");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		logger.info("Enter email id");
		lp.setPassword(rb.getString("pass"));
		logger.info("Enter password");
		lp.Click_Btn_login();
		logger.info("click on login button");
		hp.click_Myaccount();
		MyAccountPage map=new MyAccountPage(driver);
		map.Click_change_password();
		ChangePasswordPage cpp=new ChangePasswordPage(driver);
		cpp.Text_old_pass(rb.getString("pass"));
		cpp.Set_new_pass("shalu123");
		cpp.Set_conf_pass("shalu123");
		cpp.Click_change_pass();
		cpp.Click_Close_btn_pawd_changed_msg();;
	    map.Click_logout();
	    hp.click_Login();
	    lp.setEmail(rb.getString("Email"));
		logger.info("Enter email id");
		lp.setPassword("shalu123"); 
		lp.Click_Btn_login();
		Assert.assertEquals(map.Get_Text_MyAccount(),"My account");
		
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		logger.info("***************TC_LF_17_Finish*********************************");
	}
	
	}

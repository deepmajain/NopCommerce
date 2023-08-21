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
		lp.click_Btn_login();
		logger.info("click on login button");
		hp.click_Myaccount();
		MyAccountPage map=new MyAccountPage(driver);
		map.click_change_password();
		logger.info("clicked on chnages password link");
		ChangePasswordPage cpp=new ChangePasswordPage(driver);
		cpp.text_old_pass(rb.getString("pass"));
		logger.info("Enter old password");
		cpp.set_new_pass("shalu123");
		logger.info("Enter new password");
		cpp.set_conf_pass("shalu123");
		logger.info("Enter confirm password");
		cpp.click_change_pass();
		logger.info("click on chnage password link");
		cpp.click_Close_btn_pawd_changed_msg();;
	    map.click_logout();
	    logger.info("click on logout button");
	    hp.click_Login();
	    logger.info("click on login button");
	    lp.setEmail(rb.getString("Email"));
		logger.info("Enter email id");
		lp.setPassword("shalu123"); 
		logger.info("enter your changed password");
		lp.click_Btn_login();
		logger.info("click on login button");
		Assert.assertEquals(map.get_Text_MyAccount(),"My account");
		
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		logger.info("***************TC_LF_17_Finish*********************************");
	}
	
	}

package testCases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_LF_08_ValidateLoginFunctionalityUsingTabAndEnterKey extends BaseClass 
	{
	@Test
	public void login()
	{ 
		try
		{
		logger.info("***********************TC_LF_08_Strat*****************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.Text_Email.sendKeys(Keys.TAB);
		logger.info("get cursor on email field by using TAB key");
		lp.setEmail(rb.getString("Email"));
		logger.info("Enter valid Email id using TAB key");
		lp.Text_Password.sendKeys(Keys.TAB);
		logger.info("get cursor on PAssword field by using TAB key");
		lp.setPassword(rb.getString("pass"));
		logger.info("Enter invalid password using TAB key");
		lp.Btn_Login.sendKeys(Keys.TAB);
		logger.info("get cursor on login button by using TAB key");
		lp.Btn_Login.sendKeys(Keys.ENTER);
		logger.info("Enter login button by using TAB key");
		MyAccountPage map=new MyAccountPage(driver);
		Assert.assertEquals(map.Get_Text_MyAccount(),"My account");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_08_Finish*****************************");
	}
	
	}

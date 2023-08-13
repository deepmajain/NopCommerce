package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LF_11_ValidateBrowsingBackBtnOnlogout extends BaseClass 
	{
	@Test
	public void login()
	{
		try
		{
		logger.info("***************TC_LF_11_Start*********************************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		logger.info("click on login link");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		logger.info("Enter Email id");
		lp.setPassword(rb.getString("pass"));
		logger.info("Enter Password");
		lp.Click_Btn_login();
		logger.info("click on login button");
		lp.click_logout(); 
		logger.info("click on logout button");
		driver.navigate().back();
		logger.info("click on browsing back button");
		Assert.assertEquals(hp.link_Login.isDisplayed(),true);
		logger.info("login page should displayed");
		}
			catch(Exception e) 
		  {
				
				Assert.fail();
			}
		logger.info("***************TC_LF_11_Finish*********************************");
		}
		
	}
	

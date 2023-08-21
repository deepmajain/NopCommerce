package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_MAF_11_ValidateSearchFunctionality extends BaseClass
	{
	@Test
	 public void myaccount()
	 {
		try
		{
		logger.info("*********************TC_MAF_11_Start_********************");
		 HomePage hp= new HomePage(driver);
		 hp.click_Login();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("Email"));
		 lp.setPassword(rb.getString("pass"));
		 lp.click_Btn_login();
		 hp.Text_Search_iteam();
		 hp.click_Search_btn();
		 SearchPage sp=new SearchPage(driver);
		 Assert.assertEquals(sp.search_Is_Displayed(),true);
		 logger.info("*********************TC_MAF_11_finish_********************");
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	 }
	}

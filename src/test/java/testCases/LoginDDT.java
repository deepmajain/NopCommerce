package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginDDT extends BaseClass
	{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void loginDDt(String email,String password,String result)
	{
		try
		{
	
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.Click_Btn_login();
		
		MyAccountPage myacc=new MyAccountPage(driver);
		
		 String text=myacc.Get_Text_MyAccount();
		
		if(result.equals("valid"))
		{
			if(text.equals("My account"))
			{
				lp.click_logout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(result.equals("invalid"))
		{
			if(text.equals("My account"))
			{
				lp.click_logout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
	    }
		}
		catch(Exception e)
		{
			Assert.fail();
		}

	}
	}
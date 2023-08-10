package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_05ValidatePasswordLessThenSixChar extends BaseClass
	{
	@Test(priority=1,dataProvider="dp")
	public void registration(String pass)
	{
		logger.info("************************TC_05 Start**********************");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.click_Registration();
		RegistrationPage rp=new RegistrationPage(driver);
		rp.Text_password.sendKeys(pass);
		rp.click_Btn_Register();
		Assert.assertEquals(rp.pass_hve6ltter_error_msg_displayed(),true,"please enter 6 letter password");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***************TC_05 Finish*********************");
	}

	@DataProvider(name= "dp")
	String[] testData() 
	{
		String data[]= {"1","22","123","1234","12345"};
		return data;
	}
	
	}
	
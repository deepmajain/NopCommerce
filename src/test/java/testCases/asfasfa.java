package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

import testBase.BaseClass;

public class asfasfa extends BaseClass
	{
	@Test
	 public void login()
	 {
		try 
		{
			logger.info("******************************TC_LF_02_Start***********************");
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		//lp.setPassword("544524");
		//lp.Text_Password.sendKeys(Keys.CONTROL+"A");
		Actions ac= new Actions(driver);
		ac.moveToElement(lp.Text_Password).contextClick().build().perform();
		
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("******************************TC_LF_02_Finish***********************");
	 }
	}

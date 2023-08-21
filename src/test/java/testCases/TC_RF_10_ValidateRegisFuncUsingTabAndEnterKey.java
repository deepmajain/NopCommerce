package testCases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_10_ValidateRegisFuncUsingTabAndEnterKey extends BaseClass 
	{
	@Test
	public void login()
	{ 
		try
		{
		logger.info("***********************TC_LF_10_Strat*****************************");
		 HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.Select_female_radio.sendKeys(Keys.TAB);
		  rp.select_Female();
		  logger.info("select female gender option ");
		  rp.Text_fname.sendKeys(Keys.TAB);
		  rp.text_Fname(randomeString().toUpperCase());
		  logger.info("Enter first name");
		  rp.Text_Lname.sendKeys(Keys.TAB);
		  rp.text_Lname(randomeString().toUpperCase());
		  logger.info("Enter last name");
		  rp.Select_DOB_Day.sendKeys(Keys.TAB);
		  rp.Select_DOB_Month.sendKeys(Keys.TAB);
		  rp.Select_DOB_Year.sendKeys(Keys.TAB);
		  rp.select_DOB(randomeNumber(),randomeString(),randomeString()); 
		  logger.info("Enter DOB");
		  rp.Text_Email.sendKeys(Keys.TAB);
		  rp.set_Email(randomeString()+"@gmail.com");
		  logger.info("Enter gamil");
		  rp.Text_Company.sendKeys(Keys.TAB);
		  rp.Set_Company(randomeString());
		  logger.info("Entercompany name");
		  rp.Select_Newsletter.sendKeys(Keys.TAB);
		  rp.select_Newsletter();
		  logger.info("unchecked newsletter option");
		  rp.Text_password.sendKeys(Keys.TAB);
		  rp.set_password();
		  logger.info("Enter password");
		  rp.Text_Conf_password.sendKeys(Keys.TAB);
		  rp.set_ConPassword();
		  logger.info("Enter confirm password");
		  rp.Btn_register.sendKeys(Keys.ENTER);
		  logger.info("clicked on registraion btn");
		  Assert.assertEquals(rp.register_is_displayed(),true);
		 }
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***********************TC_LF_10_Finish*****************************");
	}
	
	}

package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_15_RegisterAccountFromLoginPage extends BaseClass
	{
	
	
	  @Test(priority=1)
	  public void registration()
	  {
		  try
		  {
		  logger.info("*************************TC_15_Start***************************");
		  HomePage hp=new HomePage(driver);
		  hp.click_Login();
		  LoginPage lp=new LoginPage(driver);
		  lp.click_Btn_Register();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.select_Female();
		  logger.info("select female gender option ");
		  rp.text_Fname(randomeString().toUpperCase());
		  logger.info("Enter first name");
		  rp.text_Lname(randomeString().toUpperCase());
		  logger.info("Enter last name");
		  rp.Select_DOB(randomeNumber(),randomeString(),randomeString()); 
		  logger.info("Enter DOB");
		  rp.set_Email(randomeString()+"@gmail.com");
		  logger.info("Enter gamil");
		  rp.Set_Company(randomeString());
		  logger.info("Entercompany name");
		  rp.select_Newsletter();
		  logger.info("unchecked newsletter option");
		  rp.set_password();
		  logger.info("Enter password");
		  rp.set_ConPassword();
		  logger.info("Enter confirm password");
		  rp.click_Btn_Register();
		  logger.info("clicked on registraion btn");
		  Assert.assertEquals(rp.register_is_displayed(),true);
		  }
		  
		  catch(Exception e)
			{
				Assert.fail();
			}
		  logger.info("*************************TC_15_ Finish***************************");
	  }
	
	
	 
	}
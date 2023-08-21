package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_RF_09_ValidateExistingEmailId extends BaseClass
	{
	
	@Test(priority=1)
	  public void registration()
	  {
		 
		  try
		  {
			  for(int i=1;i<3; i++)
			  {
		  logger.info("*************************TC_09 Start***************************");
		  HomePage hp=new HomePage(driver);
		  hp.click_Registration();
		  logger.info("clicked on registration link");
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.select_Female();
		  logger.info("select female gender option ");
		  rp.text_Fname(randomeString().toUpperCase());
		  logger.info("Enter first name");
		  rp.text_Lname(randomeString().toUpperCase());
		  logger.info("Enter last name");
		  rp.select_DOB(randomeNumber(),randomeString(),randomeString()); 
		  logger.info("Enter DOB");
		  rp.set_Email("deep@gmail.com");
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
			  }
			  RegistrationPage rp=new RegistrationPage(driver);
			  Assert.assertEquals(rp.email_already_exist(),true);
			  logger.info("specified mail is is alresdy exsits");
		  }
		  
		  catch(Exception e)
			{
				Assert.fail();
			}
		  logger.info("*************************TC_09 Finish***************************");
	  }
	
	

	}

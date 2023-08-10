package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckOutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class EndToEndTestCase extends BaseClass
	{
	@Test
	public void endToEnd()
	{
		HomePage hp=new HomePage(driver);
		hp.click_Login();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("Email"));
		lp.setPassword(rb.getString("pass"));
		lp.Click_Btn_login();
		hp.Text_Search_iteam();
		hp.click_Search_btn();
		SearchPage sp=new SearchPage(driver);
		sp.click_on_ProductItem();
		Assert.assertEquals(sp.Msg_successFully_ItemAdded_intocart(),true);
		hp.click_ShoppingCart_btn();
		ShoppingCartPage sc=new ShoppingCartPage(driver);
		sc.click_On_checkbox_termNCondition();
		sc.click_On_Btn_CheckOut();
		CheckOutPage cop=new CheckOutPage(driver);
		cop.set_Fname(randomeString().toUpperCase());
		cop.set_Lname(randomeString().toUpperCase());
		cop.set_Email(randomeString()+"@gmail.com");
		cop.set_Company_name(randomeString().toUpperCase());
		cop.set_Country_Name("india");
		cop.set_City(randomeString());
		cop.set_Add(randomeString());
		cop.set_Postal_Code(randomeNumber());
		cop.set_Phone(randomeNumber());
		cop.click_on_btnContinue_Billing();
		
		
		
	}
	}

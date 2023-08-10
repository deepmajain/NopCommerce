package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProductReviewPage extends BasePage{

	public MyProductReviewPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//li[@class='change-password inactive']") WebElement Heading_My_Product_Review;
	
	//Action:
	 public boolean heading_My_Product_Review_Msg_Displayed()
	 {
		 Heading_My_Product_Review.isDisplayed();
		 return true;
	 }

}

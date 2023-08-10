package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RewardsPointPage extends BasePage{

	public RewardsPointPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//a[normalize-space()='Reward points']") WebElement Heading_Rewards_points;
	
	//Action:
	 public boolean  heading_Rewards_points_Msg_Displayed()
	 {
		 Heading_Rewards_points.isDisplayed();
		 return true;
	 }

}

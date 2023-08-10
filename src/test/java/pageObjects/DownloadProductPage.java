package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadProductPage extends BasePage{

	public DownloadProductPage(WebDriver driver) {
		super(driver);
		
	}
	//locators:
	@FindBy(xpath="//a[normalize-space()='Downloadable products']") WebElement Heading_DownloadProduct;
	
	//Action:
	 public boolean  heading_DownloadProduct_Msg_Displayed()
	 {
		 Heading_DownloadProduct.isDisplayed();
		 return true;
	 }

}

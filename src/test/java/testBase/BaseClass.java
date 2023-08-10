package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
	{
	 static public WebDriver driver;
	 public Logger logger ;
	 public ResourceBundle rb;
	
	 @Parameters("browser")
	 @BeforeClass
	 public void setup(String br)
	 {
		 //Resource bundle for config.properties
		 rb=ResourceBundle.getBundle("config");
		 //logging
		 logger= LogManager.getLogger(this.getClass());
		 
		 //browser selection
		 if(br.equals("chrome")|| br.equals(""))
		 {
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 }
		 else if(br.equals("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 else if(br.equals("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		 }
		 
		 //url open
		 driver.get(rb.getString("AppURL"));
		 driver.manage().window().maximize();
	 }
	 
	 
	 public String randomeString()
	 {
		String randomeString= RandomStringUtils.randomAlphabetic(5);
		return randomeString;
	 }
	 
	 public String randomeNumber()
	 {
		 String randomNumber=RandomStringUtils.randomNumeric(10);
		 return randomNumber;
	 }
	 public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\screensorts\\" + tname + "_" + timeStamp + ".png";

			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (Exception e) {
				e.getMessage();
			}
			return destination;

		}
	 @AfterClass
	 public void tearDown()
	 {
		 driver.quit();
	 }
		
	}

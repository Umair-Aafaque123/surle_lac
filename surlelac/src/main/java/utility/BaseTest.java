package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest 
{
	public static WebDriver driver = null;
	public static WebDriverWait wait; 
	@BeforeSuite
	public void display1() throws IOException 
	{
		ExtentReportClass.setExtent();
	}
	@BeforeTest
	@Parameters("browserName")
	public void setBrowser(String browserName) throws InterruptedException 
	{
	
			if(browserName.equals("Chrome"))  
			{
				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				System.out.println("Testing on Chrome");
				
			}
//			else if(browserName.equals("Edge"))  
//			{
//				//WebDriverManager.chromedriver().setup();
//				driver = new EdgeDriver();
//				System.out.println("Testing on MicrosoftEdge");
//				
//			}
//			else if(browserName.equals("Safari"))  
//			{
//				//WebDriverManager.chromedriver().setup();
//				driver = new SafariDriver();
//				System.out.println("Testing on Safari");
//				
//			}
			else 
			{
				System.out.println("No browser configured");
			}
			
//			driver.get("https://surlelac.co/collections/all");
			driver.get(TestUtil.getPropertiesData("url"));

			driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	
	public static void waitExplicitMethod(WebDriver driver,WebElement element) 
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void isElementVisible(WebDriver driver,WebElement element,String msg)
	{
		BaseTest.waitExplicitMethod(driver, element);
		element.isDisplayed();
		TestUtil.log().info(msg);
	}
	
	@AfterSuite
	public void display2() throws IOException 
	{
		ExtentReportClass.endReport();
	}
	
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
			
					
}

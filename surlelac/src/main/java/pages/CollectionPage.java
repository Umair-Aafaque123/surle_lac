package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.BaseTest;
import utility.ExtentReportClass;
import utility.TestUtil;

public class CollectionPage
{
	public WebDriver driver = null;
	
	@FindBy(xpath = "//a[@href='/products/101-t-shirt']")
	private WebElement firstProduct;
	
	@FindBy (xpath = "//input[@id='swatch-detail-43150060552366-1-L']")
	private WebElement largeSize;

	@FindBy(xpath = "//button[@name='add']")
	private WebElement addToCart;
			
	@FindBy(xpath = "//button[@name='checkout']")
	private WebElement checkOut;
	 
	
	// umair aafaque shamim akhtar
	
	public CollectionPage(WebDriver driver)   
	{
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
		
		
	}
	public boolean clickFirstProduct() throws InterruptedException 
	{
		boolean result = false;
		try {
			BaseTest.isElementVisible(driver, firstProduct, "FirstProduct is visible");
			firstProduct.click();
			TestUtil.log().info("Successfully clicked on first product");
			result = true;
			ExtentReportClass.test.log(Status.PASS,"click first product");
			Thread.sleep(4000);
			
		}
		catch(Exception e) {
			TestUtil.log().error(e);
			ExtentReportClass.test.log(Status.FAIL,"faild to click first product");

			
		}
		return result;
		
	}
	
	public boolean clickaddToCart() throws InterruptedException 
	{
		boolean result = false;
		try {
			BaseTest.isElementVisible(driver, addToCart, " addtochart is visible");
			addToCart.click(); 
			TestUtil.log().info("Successfully clicked on add to chart");
			result = true;
			ExtentReportClass.test.log(Status.PASS,"click add to chart");
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			TestUtil.log().error(e);
			ExtentReportClass.test.log(Status.FAIL,"faild to add to chart");

		}
		return result;
	}
	
	public boolean clickcheckOut() 
	{
		boolean result = false;
		try 
		{
		BaseTest.isElementVisible(driver, checkOut, "Checkout is visible");
		checkOut.click();
		TestUtil.log().info("Successfully clicked on check out");
		Thread.sleep(3000);
		result = true;
		ExtentReportClass.test.log(Status.PASS,"click to Checkout ");

		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
			ExtentReportClass.test.log(Status.FAIL,"faild to Checkout");


		}
		return result;
	}











}

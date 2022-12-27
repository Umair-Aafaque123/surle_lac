 package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import utility.BaseTest;
import utility.ExtentReportClass;
import utility.TestUtil;

public class Form_Data {
	public WebDriver driver = null;
	
	//@FindBy(xpath = "//input[@id='email']")
	//@FindBy (xpath = "//*[@id=\"email\"]")
	@FindBy (xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
//	@FindBy (xpath = "//select[@name=\"countryCode\"]")
//	private WebElement scrollCountry;
	
	@FindBy (xpath = "//input[@id='TextField1']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='TextField2']")
	private WebElement lastName;
	
	@FindBy (xpath ="//div[@class='_3oHx1 wJzc6']")
	//@FindBy (xpath="//div[@class='DROWl']//button[@type='button']")
	private WebElement closePopup;
	
	@FindBy (xpath = "//select[@name=\"countryCode\"]")
	private WebElement scrollCountry;
	
	@FindBy (xpath = "//input[@id='address1']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@id='TextField4']")
	private WebElement apartment;
	
//	@FindBy (xpath = "//input[@id='TextField5']")
	@FindBy(xpath = "//input[@id='TextField5']")
	private WebElement city;
	
	@FindBy (xpath = "//input[@id='TextField7']")
	private WebElement city1;
	
	@FindBy (xpath = "//select[@name='zone']")
	private WebElement state;
	
	//@FindBy (xpath = "//input[@id='TextField16']")
	@FindBy(xpath = "//input[@id='TextField8']")
	private WebElement zipcode;
	
	@FindBy (xpath = "//button[@class='_2pOWh uWTUp _1Kqoj _2tVwl _3MrgP _10zXD sd4hU']")
	private WebElement continueTo;
	
	@FindBy (xpath = "//a[@class='JXMCh']")
	private WebElement surlelac;
	
	public Form_Data(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public boolean clickEmail() 
	{
		boolean result = false;
		try 
		{
			email.click();
			TestUtil.log().info("Successfully clicked on check out");
			email.sendKeys(TestUtil.getPropertiesData("email"));
			result = true;
			ExtentReportClass.test.log(Status.PASS,"click to emailBtn ");

		}
		catch(Exception e) 
		{
		//	System.out.println("clicked");
			TestUtil.log().error(e);
			ExtentReportClass.test.log(Status.FAIL,"faild to emailBtn");

		}
		return result;
	}
	
	public boolean clickCheckBox() 
	{
		boolean result = false;
		try 
		{
			checkBox.click();
			TestUtil.log().info("Successfully clicked on check box");
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public boolean enterfirstName() 
	{
		boolean result = false ;
		try 
		{
			firstName.click();
			TestUtil.log().info("Successfully clicked on first name");
			firstName.sendKeys("Umair");
			result =  true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public boolean enterlastName()
	{
		boolean result = false;
		try 
		{
			lastName.click();
			TestUtil.log().info("Successfully clicked on last name");
			lastName.sendKeys("Aafaque");
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public void clickPopup() 
	{
		try 
		{
		//	TestUtil.log().info("Successfully clicked on popup");
			closePopup.click();
		}
		catch(Exception e) 
		{
			//TestUtil.log().error(e);
			//closePopup.click();
			System.out.println(e);
		}
	}
	
	public boolean scrollAddress() throws InterruptedException
	{
		boolean result = false;
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", scrollCountry);
//			Thread.sleep(4000);
			BaseTest.waitExplicitMethod(driver, scrollCountry);
			result = true;
		}
		catch(Exception e) 	
		{
			TestUtil.log().error(e);
		}
		return result;
	}	
	
	public boolean enterAddress() 
	{
		boolean result = false;
		try 
		{
			address.click();
			TestUtil.log().info("Successfully clicked on address");
			address.sendKeys("223 Magnolia Avenue");
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public boolean enterApartment() 
	{
		boolean result = false;
		try 
		{
			apartment.click();
			TestUtil.log().info("Successfully clicked on apartment");
			apartment.sendKeys("Kamptee");
			result = true;
			Thread.sleep(3000);
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public boolean enterCity() 
	{
		boolean result = false;
		try 
		{
			city.click();
			//TestUtil.log().info("Successfully clicked on city");
			city.sendKeys("Daytona Beach");
			result = true;
		}
		catch(Exception e) 
		{
			//TestUtil.log().error(e);
			city1.click();
			//TestUtil.log().info("Successfully clicked on city1");
			city1.sendKeys("Daytona Beach");
			result = true;
			//System.out.println(e);
			

		}
		return result;
	}
	
	public boolean enterState() 
	{
		boolean result = false;
		try 
		{
			state.click();
			TestUtil.log().info("Successfully clicked on state");
			Select st = new Select(state);
			st.selectByValue("FL");
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
	public boolean enterZipcode() 
	{
		boolean result = false;
		try
		{
			zipcode.click();
			TestUtil.log().info("Successfully clicked on zipcode");
			zipcode.sendKeys("32114");
			Thread.sleep(3000);
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	}
		
		
	public boolean clickcontinue() 
	{
		boolean result = false;
		try 
		{
			continueTo.click();
			TestUtil.log().info("Successfully clicked on continue");
			Thread.sleep(2000);
			result = true;
		}
		catch(Exception e) 
		{
			TestUtil.log().error(e);
		}
		return result;
	} 
	
	public boolean clickSurlelac() 
	{
		boolean result = false;
		
		try 
		{
			Thread.sleep(3000);
			surlelac.click();
			TestUtil.log().info("Successfully clicked on surlelac");
			result = true;
		}
		catch(Exception e)  
		{
			TestUtil.log().error(e);
		}
		return result;
	}
	
		
		
	























}


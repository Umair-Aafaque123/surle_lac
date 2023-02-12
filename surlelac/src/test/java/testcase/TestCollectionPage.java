package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.CollectionPage;
import pages.Form_Data;
import utility.BaseTest;
import utility.ExtentReportClass;

public class TestCollectionPage extends BaseTest 
{
	@Test(description="Test_CollectionPage")
	public void testCollectionPage() throws InterruptedException 
	{
	
		CollectionPage cp = new CollectionPage(driver);  
		Form_Data fd = new Form_Data(driver);
			boolean checkclickclose= cp.clickFirstPopUp();
			Assert.assertEquals(checkclickclose, true,"failed to click on popup");
			boolean checkclickFirstProduct = cp.clickFirstProduct();
			Assert.assertEquals(checkclickFirstProduct, true,"failed to click on first product");
			boolean checkClickAddtoCart = cp.clickaddToCart(); 
			Assert.assertEquals(checkClickAddtoCart, true,"failed to click on add to cart button");
			boolean checkclickcheckOut = cp.clickcheckOut();
			Assert.assertEquals(checkclickcheckOut, true);
			//Info
			boolean clickpUp = fd.clickPopup();
			Assert.assertEquals(clickpUp, true,"Failed to click before email");
			boolean enterEmail = fd.clickEmail();
			Assert.assertEquals(enterEmail, true,"failed to click on email");
			boolean clickpUp1 = fd.clickPopup();
			Assert.assertEquals(clickpUp1, true,"Failed to click before checkbox");
			boolean clickCheck = fd.clickCheckBox();
			Assert.assertEquals(clickCheck, true);
			boolean clickpUp2 = fd.clickPopup();
			Assert.assertEquals(clickpUp2, true,"Failed to click before firstname");
			boolean checkFirst = fd.enterfirstName();
			Assert.assertEquals(checkFirst, true);
			boolean clickpUp3 = fd.clickPopup();
			Assert.assertEquals(clickpUp, true,"Failed to click before lastname");
			boolean checkLast = fd.enterlastName();
			Assert.assertEquals(checkLast, true);
			boolean clickpUp4 = fd.clickPopup();
			Assert.assertEquals(clickpUp4, true,"Failed to click before scrollAddress");
			boolean checkScroll = fd.scrollAddress();
			Assert.assertEquals(checkScroll, true);
			boolean clickpUp5 = fd.clickPopup();
			Assert.assertEquals(clickpUp5, true,"Failed to click before address");
			boolean checkAddress = fd.enterAddress();
			Assert.assertEquals(checkAddress, true,"failed to click on address");
			boolean clickpUp6 = fd.clickPopup();
			Assert.assertEquals(clickpUp6, true,"Failed to click before apartment");
			boolean checkApartment = fd.enterApartment();
			Assert.assertEquals(checkApartment, true);
			boolean clickpUp7 = fd.clickPopup();
			Assert.assertEquals(clickpUp7, true,"Failed to click before city");
			boolean checkCity = fd.enterCity();
			Assert.assertEquals(checkCity, true,"failed to click on city");
			boolean clickpUp8 = fd.clickPopup();
			Assert.assertEquals(clickpUp8, true,"Failed to click before zip");
		//	boolean checkState = fd.enterState();
			//Assert.assertEquals(checkState, true);
			//fd.clickPopup();
			boolean checkZipcode = fd.enterZipcode();
			Assert.assertEquals(checkZipcode, true);
			boolean clickpUp9 = fd.clickPopup();
			Assert.assertEquals(clickpUp9, true,"Failed to click before continue");
			boolean checkContinue = fd.clickcontinue();
			Assert.assertEquals(checkContinue, true);
			boolean clickpUp10 = fd.clickPopup();
			Assert.assertEquals(clickpUp10, true,"Failed to click before logo");
			boolean checkSurlelacLogo = fd.clickSurlelac();
			Assert.assertEquals(checkSurlelacLogo, true,"failed to click on logo"); 
	}
	
}

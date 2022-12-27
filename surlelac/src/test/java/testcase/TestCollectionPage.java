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
			boolean checkclickFirstProduct = cp.clickFirstProduct();
			Assert.assertEquals(checkclickFirstProduct, true,"failed to click on first product");
			boolean checkClickAddtoCart = cp.clickaddToCart(); 
			Assert.assertEquals(checkClickAddtoCart, true,"failed to click on add to cart button");
			boolean checkclickcheckOut = cp.clickcheckOut();
			Assert.assertEquals(checkclickcheckOut, true);
			//Info
			fd.clickPopup();
			boolean enterEmail = fd.clickEmail();
			Assert.assertEquals(enterEmail, true,"failed to click on email");
			fd.clickPopup();
			boolean clickCheck = fd.clickCheckBox();
			Assert.assertEquals(clickCheck, true);
			fd.clickPopup();
			boolean checkFirst = fd.enterfirstName();
			Assert.assertEquals(checkFirst, true);
			fd.clickPopup();
			boolean checkLast = fd.enterlastName();
			Assert.assertEquals(checkLast, true);
			fd.clickPopup();
			boolean checkScroll = fd.scrollAddress();
			Assert.assertEquals(checkScroll, true);
			fd.clickPopup();
			boolean checkAddress = fd.enterAddress();
			Assert.assertEquals(checkAddress, true,"failed to click on address");
			fd.clickPopup();
			boolean checkApartment = fd.enterApartment();
			Assert.assertEquals(checkApartment, true);
			fd.clickPopup();
			boolean checkCity = fd.enterCity();
			Assert.assertEquals(checkCity, true,"failed to click on city");
			fd.clickPopup();
		//	boolean checkState = fd.enterState();
			//Assert.assertEquals(checkState, true);
			//fd.clickPopup();
			boolean checkZipcode = fd.enterZipcode();
			Assert.assertEquals(checkZipcode, true);
			fd.clickPopup();
			boolean checkContinue = fd.clickcontinue();
			Assert.assertEquals(checkContinue, true);
			fd.clickPopup();
			boolean checkSurlelacLogo = fd.clickSurlelac();
			Assert.assertEquals(checkSurlelacLogo, true,"failed to click on logo"); 
	}
	
}

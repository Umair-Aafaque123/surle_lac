package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listner extends ExtentReportClass implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getMethod().getDescription());
		
	}
//
	public void onTestSuccess(ITestResult result) 
	{
		if (result.getStatus() == ITestResult.SUCCESS )
		{
			test.log(Status.PASS, "Passed test case : "+result.getName());
		}
	}
//
	public void onTestFailure(ITestResult result) 
	{

        TakesScreenshot scrShot =((TakesScreenshot)BaseTest.driver);


                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                System.out.println (" SrcFile :-"+SrcFile);
                SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
                System.out.println("formatter :-"+formatter);
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                System.out.println("timestamp :-"+timestamp);
//                Date date = new Date();  
                
                String ssPath = "./screenshot/"+formatter.format(timestamp)+"_Failed.png";
                File DestFile=new File(ssPath);
                System.out.println("ssPath :-"+ssPath);
                //Copy file at destination

                try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                if (result.getStatus() == ITestResult.FAILURE) 
        		{
        			try {
        				test.log(Status.FAIL,
        						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
        				test.log(Status.FAIL,
        						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
        				
        				test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshot/"+formatter.format(timestamp)+"_Failed.png");
        				
        				//test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+result.getName()+" Failed"+".png"));
        				
        			} catch (Exception e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        		}


	}
//
	public void onTestSkipped(ITestResult result)
	{
		if (result.getStatus() == ITestResult.SKIP )
		{
			test.log(Status.SKIP, "Skipped test case is : "+result.getName());
		}
	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
//
}

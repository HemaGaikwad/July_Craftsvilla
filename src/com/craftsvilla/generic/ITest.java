package com.craftsvilla.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITest implements ITestListener 
{

	
	public void onTestStart(ITestResult result) {
		
		
	}

	
	public void onTestSuccess(ITestResult result) {
	
		
	}


	public void onTestFailure(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
		File src  = event.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("./Screenshots/"+name+".png"));
			
		}
		catch (Exception e) 
		{
			Reporter.log("Unable to capture screenshot");
		}
	}


	public void onTestSkipped(ITestResult result) {

		
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}


	public void onStart(ITestContext context) {

		
	}


	public void onFinish(ITestContext context) {

		
	}
	

}

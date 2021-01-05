package com.generalstore.reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.generalstore.init.IConstant;
import com.generalstore.libaries.BaseTest;
import com.generalstore.utils.MoblieActionUtility;

public class ListenerLibrary implements ITestListener{
	public void onTestStart(ITestResult result) {
		ExtentReporter.testlog.log(Status.INFO, result.getName()+" is Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		ExtentReporter.testlog.log(Status.PASS, result.getName()+" is Pass");
		
	}

	public void onTestFailure(ITestResult result) {
		ExtentReporter.testlog.log(Status.FAIL, result.getName()+" is Fail");
		try {
			MoblieActionUtility.capture(BaseTest.gv.driver, result.getName());
			ExtentReporter.testlog.addScreenCaptureFromPath(IConstant.screenShotPath+result.getName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		ExtentReporter.testlog.log(Status.FAIL, result.getName()+" is fail");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		ExtentReporter.report(context);
		ExtentReporter.testlog.log(Status.INFO, context.getName()+"suite is started");	
		
	}

	public void onFinish(ITestContext context) {
		ExtentReporter.testlog.log(Status.INFO, context.getName()+" Suite is Completed");
		ExtentReporter.report.flush();
	}

}

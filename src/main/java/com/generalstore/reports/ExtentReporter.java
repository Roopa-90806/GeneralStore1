package com.generalstore.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IClassListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generalstore.init.IConstant;

public class ExtentReporter  {
	
		
		public static ExtentReports report;
		public static ExtentTest testlog;
		public static void report(ITestContext result)
		{
			SimpleDateFormat df=new SimpleDateFormat("dd-MM-yy");
			Date date=new Date();
			
			ExtentHtmlReporter htmlreport=new ExtentHtmlReporter(IConstant.DIR_Path+"/Reports/ApplicationBuild_ "+df.format(date)+".html");
			htmlreport.config().setDocumentTitle("App report");
			htmlreport.config().setReportName(result.getName());
			htmlreport.config().setTheme(Theme.DARK);
			
			report=new ExtentReports();
			report.attachReporter(htmlreport);
			testlog=report.createTest(result.getName());
			
		}
		

	

}

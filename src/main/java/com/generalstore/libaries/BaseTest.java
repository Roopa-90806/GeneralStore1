package com.generalstore.libaries;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.generalstore.init.GlobalVariables;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest {
	
	public static GlobalVariables gv=new GlobalVariables();
	AppiumDriverLocalService service;
	
	@BeforeSuite
	public void startServer()
	{
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	@AfterSuite
	public void stopServer()
	{
		service.stop();
	}
	
	@BeforeMethod
	public void tearUp() throws MalformedURLException, InterruptedException
	{
		gv.capabilities=new DesiredCapabilities();
		gv.capabilities.setCapability("deviceName", gv.deviceName);
		gv.capabilities.setCapability("automationName",gv.automationName);
		gv.capabilities.setCapability("platformName", gv.platformName);
		gv.capabilities.setCapability("UDID", gv.UDID);		
		gv.capabilities.setCapability("platformVersion", gv.platformVersion);
		gv.capabilities.setCapability("appPackage",gv.appPackage);
		gv.capabilities.setCapability("appActivity", gv.appActivity);
		System.out.println("http://127.0.0.1:"+gv.port+"/wd/hub");
		gv.driver = new AndroidDriver(new URL("http://127.0.0.1:"+gv.port+"/wd/hub"), gv.capabilities);
		gv.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	}

}

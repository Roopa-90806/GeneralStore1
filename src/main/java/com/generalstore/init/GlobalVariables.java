package com.generalstore.init;


import org.openqa.selenium.remote.DesiredCapabilities;

import com.generalstore.libaries.GenericLibrary;

import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Roopa
 *This class contains the global variables and desiredcapabilities values
 */
public class GlobalVariables 
{
	//Global variables
	public DesiredCapabilities capabilities;
	public AndroidDriver driver;
	
	//Desired capabilities values
	public String deviceName=GenericLibrary.getPropertyValue(IConstant.DC_File,"deviceName");
	public String automationName=GenericLibrary.getPropertyValue(IConstant.DC_File,"automationName");
	public String platformName=GenericLibrary.getPropertyValue(IConstant.DC_File, "platformName");
	public String UDID=GenericLibrary.getPropertyValue(IConstant.DC_File, "UDID");
	public String platformVersion=GenericLibrary.getPropertyValue(IConstant.DC_File,"platformVersion");
	public String appPackage=GenericLibrary.getPropertyValue(IConstant.DC_File, "appPackage");
	public String appActivity=GenericLibrary.getPropertyValue(IConstant.DC_File, "appActivity");
	public int port=Integer.parseInt(GenericLibrary.getPropertyValue(IConstant.DC_File, "port"));


}

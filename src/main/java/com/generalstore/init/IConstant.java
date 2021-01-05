package com.generalstore.init;

/**
 * 
 * @author Roopa
 * This interface contains the path to the excel file,properties file etc
 */
public interface IConstant 
{
	public static String DIR_Path=System.getProperty("user.dir");
	public static String DC_File=DIR_Path+"/src/test/resources/DCapabilities.properties";
	public static String Excel_path=DIR_Path+"/src/test/resources/Data/Input.xlsx";
	public static String screenShotPath = DIR_Path+"/ScreenShots/";

}

package com.generalstore.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generalstore.init.IConstant;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MoblieActionUtility {
	
	@Test
	/**
	 * This method is used tap on the element on the page.
	 * @param element
	 * @param driver
	 */
	public static void tapOnElement(WebElement element, AndroidDriver driver)  {
		try
		{
		Thread.sleep(3000);
		TouchAction act1 = new TouchAction(driver);
		act1.press(element).release().perform();
		}
		catch(InterruptedException ie)
		{
			
		}
	}
	/**
	 * this method is used to drop the element to  specified position.
	 * @param element
	 * @param driver
	 */
	
	public static void dragAndDropElement(WebElement srcElement,AndroidDriver driver,WebElement destElement) {
		
		try
		{
		Thread.sleep(3000);
		TouchAction ta = new TouchAction(driver);
		ta.longPress(srcElement).waitAction(2000).moveTo(destElement).release().perform();
		}
		catch(InterruptedException ie)
		{
			
		}
	}
	
	/**
	 * 
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	
	public static String capture(AndroidDriver driver, String screenShotName) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String dest = IConstant.screenShotPath + screenShotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
	}
	
	

}

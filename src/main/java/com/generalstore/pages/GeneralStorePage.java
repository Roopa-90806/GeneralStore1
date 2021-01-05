package com.generalstore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.generalstore.libaries.ExcelInputData;
import com.generalstore.utils.MoblieActionUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralStorePage {
	private  AndroidDriver driver;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement yourNameTab;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement shopBtn;
	
	@AndroidFindBy(xpath="//android.widget.Toast[1]")
	private MobileElement toastMsg;
	
	public GeneralStorePage(AndroidDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void sendData()	{
		
		ExcelInputData input=new ExcelInputData();
		String value = input.getDataFromExcel("Read", 1, 0);
		yourNameTab.sendKeys(value);
	}
	
	public void tapButton()	{
		MoblieActionUtility.tapOnElement(shopBtn, driver);
	}
	
	public String toastMessage()
	{
		return toastMsg.getAttribute("name");
	}
	
	
	
	
	
	
}
	
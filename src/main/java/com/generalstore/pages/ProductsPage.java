package com.generalstore.pages;

import org.openqa.selenium.support.PageFactory;

import com.generalstore.libaries.ExcelInputData;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductsPage {
	
	private AndroidDriver driver;
	ExcelInputData input=new ExcelInputData();
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Products']")
	private MobileElement titleText;
	
	
	public ProductsPage(AndroidDriver driver)	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public String titleText()	{
		
		return titleText.getText();
	}
	
	public String readTitleFromExcel()
	{
		return input.getDataFromExcel("Read", 1, 1);
	}

}

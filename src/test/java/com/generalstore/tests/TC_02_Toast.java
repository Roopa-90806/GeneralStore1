package com.generalstore.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalstore.libaries.BaseTest;
import com.generalstore.libaries.ExcelInputData;
import com.generalstore.pages.GeneralStorePage;

public class TC_02_Toast extends BaseTest{
	
	@Test
	public void toastInspector() {
		GeneralStorePage gsp=new GeneralStorePage(gv.driver);
		ExcelInputData input=new ExcelInputData();
		WebDriverWait wait=new WebDriverWait(gv.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(gv.driver.findElementById("com.androidsample.generalstore:id/toolbar_title")));
	
		gsp.tapButton();		
		//String toastMesg=gv.driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		String toastMesg=gsp.toastMessage();
		//System.out.println(toastMesg);
		Assert.assertEquals(input.getDataFromExcel("Read", 1, 2), toastMesg);
		
	}

}

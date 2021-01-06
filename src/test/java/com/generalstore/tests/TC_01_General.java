package com.generalstore.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.generalstore.init.GlobalVariables;
import com.generalstore.init.IConstant;
import com.generalstore.libaries.BaseTest;
import com.generalstore.libaries.ExcelInputData;
import com.generalstore.pages.GeneralStorePage;
import com.generalstore.pages.ProductsPage;

public class TC_01_General extends BaseTest{
	
	@Test
	public void tc_01_General() throws InterruptedException
	{
		//Step 1: Generalstore page
		GeneralStorePage gsp=new GeneralStorePage(gv.driver);
		
		//Step 2: Products page
		ProductsPage pg=new ProductsPage(gv.driver);		
		
		//Step 3: Sending data to yourName tab
		gsp.sendData();
				
		//Step 4: Tapping on Let's Shop button
		gsp.tapButton();
		Thread.sleep(2000);
		
		//Step 5: Validating the title of the Product page
		Assert.assertEquals(pg.readTitleFromExcel(),pg.titleText());
	
		
	}
	

}

package com.generalstore.libaries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.generalstore.init.IConstant;

/**
 * 
 * @author Roopa
 * This class contains the generic utilities of Excel sheet such as read data from excel sheet and write data to excel sheet.
 */

public class ExcelInputData {


	/*
	 * This method is used to get data from excel
	 * data SheetName
	 * data row
	 * data cell
	 */
	public  String getDataFromExcel(String sheetName,int row,int cell)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(IConstant.Excel_path));
			String data=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}

	/*
	 * This method is used to write data to  excel
	 * data SheetName
	 * data row
	 * data cell
	 * data value
	 */
	public void writeDataToExcel(String sheetName,int row,int cell,String value)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(IConstant.Excel_path));
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet(sheetName);
			sh.createRow(row).createCell(cell).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(IConstant.Excel_path);
			wb.write(fos);
		}
		catch(Exception e)
		{

		}
	}

}


package com.generalstore.libaries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class GenericLibrary {

	
	
	/**
	 * Roopa
	 * Description:This method is used to read the data from properties files
	 * based on Property file value
	 * @throws IOException 
	 */
	public static String getPropertyValue(String pFile,String pKey) 
	{
		Properties pro=new Properties();
		String kvalue=null;
		try {
			InputStream file=new FileInputStream(pFile);
			pro.load(file);
			kvalue=pro.getProperty(pKey);

		}
		catch(Exception e){

		}
		return kvalue;

	}






}

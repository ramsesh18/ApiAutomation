package com.assurity.rest.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Ramaseshan Thirumalai
 *
 *
 */
public class GetTestDataFromProperties {
	
	
	public String testDataMethod(String testData) throws IOException{


				// Locate Properties File
				File file=new File("testdata.properties");
				
				// Convert data into bytes
				FileInputStream fileinput =new FileInputStream(file);
				
				// Creating object of Properties Class
				Properties prop=new Properties();
				
				// Load data from inputstream to Properties object
				prop.load(fileinput);
				
				// get the value from the properties file and return it
				String value = prop.getProperty(testData);
				return value;
	}

}

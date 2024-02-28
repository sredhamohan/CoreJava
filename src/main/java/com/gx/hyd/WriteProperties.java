package com.gx.hyd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//FileReader f=new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.Properties");
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.Properties",true);
		
		Properties p=new Properties();
		p.setProperty("url","google.com");
		p.store(fos, "comments");
		
		
		
	}

}

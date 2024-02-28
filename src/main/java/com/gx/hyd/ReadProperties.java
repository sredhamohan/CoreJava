package com.gx.hyd;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//FileReader f=new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.Properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.Properties");
		
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("name"));
		
		
	}

}

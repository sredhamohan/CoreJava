package com.gx.hyd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteCSVFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\testdata.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("sredha");
		bw.close();
		
	
		
	}

}

package com.gx.hyd;

public class ClassName {
	
	private String personName; 
	private int personAge;
	
	public static void main(String[] args) {
		
		//We call method by passing the input value.
		String returedValue = saveMyName("Galaxy");
	}
	
	//Defined Method:
	private static String saveMyName(String inputName) {
		return "Saved Successfully.";
	}

}

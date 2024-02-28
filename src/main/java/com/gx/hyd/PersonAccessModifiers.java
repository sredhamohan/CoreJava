package com.gx.hyd;

public class PersonAccessModifiers {

	
	public static void main(String[] args) {
		
		PersonModel personModel = new PersonModel();
		
		//since age is private field, 
		//we cannot access it from outside of class
		//personModel.age = 10;
		personModel.name = "java";
		
		
		personModel.setAge(10);
		personModel.setName("java2");
		
		
		personModel.getAge();
		personModel.getName();

	}

}

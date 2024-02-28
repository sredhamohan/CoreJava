package com.gx.hyd;

public class Method2 {
	
	int age;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method2 m2=new Method2();
m2.add(2, 5);
sub(4,2);

	 }
 
	//what is a method?
	public void save(int a, int b) {
		int c = a+b;
		int d = c+a;
		System.out.println("Hi");
		int returnInteger = fetch(10,20);
	}
	
	public void add(int a, int b) {
		int z=a+b;
		System.out.println(z);
	}
	
	public  static void sub(int a, int b) {
		int z=a-b;
		System.out.println(z);
	}


	public int fetch(int a, int b) {
		getDetails("Galaxy");
		return 5;
	}
	
	public String getDetails(String name) {
		return "Hi";
	}
	
	//overloaded method
	public int fetch(int a, int b, int c) {
		getDetails("Galaxy");
		return 5;
	}

	

}

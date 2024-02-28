package com.gx.hyd;

public class Constructor {

	public Constructor() {
		System.out.println("this is the value of the class");
	}

	public Constructor(int i) {
		System.out.println("Value =" + i);
	}

	public Constructor(int i, int j) {
		System.out.println("Value =" + i + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10, 7);
	}

}

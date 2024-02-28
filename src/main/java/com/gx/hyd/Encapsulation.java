package com.gx.hyd;

public class Encapsulation {

	//Read-only property
	private String name;

	//write-only
	private String branchCode;


	//Read-only variable
	public String getName() {
		return this.name;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public int add(int a, int b) {

		return 10;

	}

	public int add(float a, double b, double c) {

		return 10;

	}


}

package com.gx.hyd;

public class KeywordThis {
	
	int x=10;
	int y=10;
	public final int a=10;
	
	public KeywordThis(int x,int y) {
		this.x=x;
		this.y=y;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordThis t=new KeywordThis(6,9);
		t.print();
		System.out.println(t.a);
	}
	
	
	public void print() {
		int x=8;
			int y=9;
		System.out.println(x+y );
		System.out.println(this.x+this.y );
	}

}

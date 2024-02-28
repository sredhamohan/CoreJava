package com.gx.hyd;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a =new int[10];
		a[0]=10;
		a[1]=23;
		a[2]=22;
		System.out.println(a[1]);
		System.out.println(a.length);
		
		int[] b= {10,11,82,22,22};
		System.out.println(b[2]);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		//int[][] c= new int[2][2];
		int[][] c= {{2,1},{1,9}};
		
		for(int i=0;i<c.length;i++)
		{for(int j=0;j<c.length;j++) {
			System.out.println(c[i][j]);
		}}

	}

}

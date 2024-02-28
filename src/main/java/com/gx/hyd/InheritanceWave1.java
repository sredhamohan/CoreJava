package com.gx.hyd;

public class InheritanceWave1 extends InheritanceWaveBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceWave1 w=new InheritanceWave1();
		w.start();
		w.stop();
	}

	
	public void trigger()
	{
		System.out.println("trigger");
	}
}

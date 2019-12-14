package com.comparator.demo;

import javax.swing.plaf.synth.SynthScrollBarUI;

interface I1
{
public default void m1()
{
	System.out.println("inside I1");
}
}
interface I2
{
	
public default void m1()
{
	
System.out.println("inside I2");

}



public class zxc implements I1,I2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        I2 i=new zxc();
        i.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I2.super.m1();
	}

	
	/*public void m1() {
		System.out.println("class zxc");
		I1.super.m1();
	}
*/}
}
 
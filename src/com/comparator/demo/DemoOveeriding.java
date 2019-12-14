package com.comparator.demo;
  class D
  {
	
	  
	  
	  public Number m1()
	{  
		
	
		System.out.println("In Parent class");
		return null;
		
	}

  }
class E extends D
{
   
	
	public Byte m1()
    {   
    	System.out.println("In child m1");
		return null;
		
    }
    
}


public class DemoOveeriding {
		public static void main(String[] args) {
	
         D a=new D();
          a.m1();
	
	
	}

}
 
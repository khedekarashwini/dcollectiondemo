package com.comparator.demo;
class Student
{
  
	public void show()
	{
		
		System.out.println("In Student class...");
	
	}
	
	
	class Teacher
  {
	  public void m1()
	  {
		  System.out.println("In inner class");
	  }
	  
  }


}




public class DemoInnerclass {

	public static void main(String[] args) {
		Student.Teacher ts= new Student().new Teacher(); 
             ts.m1();
         Student s1=new Student();
         s1.show();
	}

}

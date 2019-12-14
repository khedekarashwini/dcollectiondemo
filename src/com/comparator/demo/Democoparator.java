package com.comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1
{
   int roll_no;
   int age;
   String Name;
   String address;
  
  Student1(int roll_no,int age,String Name,String address)
  {
	  this.roll_no=roll_no;
	  this.age=age;
	  this.Name=Name;
	  this.address=address;
}
}
  class CompareAge implements Comparator
  {

	
	public int compare(Object o1,Object o2)
	
	{
	  Student1 s1=(Student1)o1;
	  Student1 s2=(Student1)o2;
	  
	if(s1.age==s2.age)
		return 0;
	else if(s1.age>s2.age)
		return 1;
	else
		return -1;
	}
	  
	  
  }
   
  class CompareName implements Comparator
  {
	  public int compare(Object o1,Object o2)
	  {
		  Student1 s1=(Student1)o1;
		  Student1 s2=(Student1)o2;
		  return s1.Name.compareTo(s2.Name);
	  }
  }


public class Democoparator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new Student1(1, 50, "Mohini", "pune"));
	    al.add(new Student1(2, 30, "Ashwini", "Kolhapur"));
	    al.add(new Student1(3,89,"Nikita","mumbai"));
     System.out.println("Sorted by age");
     Collections.sort(al,new CompareAge());
     Iterator ltr=al.iterator();
     while(ltr.hasNext())
     {
    	 
    	 Student1 st=(Student1) ltr.next();
    	 System.out.println("Roll no "+st.roll_no+"\tName "+st.Name+"\tAge "+st.age);
     }
    		 
	System.out.println("Sorting by name");
	Collections.sort(al,new CompareName());
	Iterator ltr1=al.iterator();
	while(ltr1.hasNext())
	{
		
		Student1 st1=(Student1) ltr1.next();
		System.err.println("Rollno "+st1.roll_no+"\tName "+st1.Name);
	}
	
	
	
	}

}


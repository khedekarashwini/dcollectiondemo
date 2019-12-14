package com.comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;

class Teacher implements Comparable<Teacher>
{
  int id;
  int age;
  String name;
  Teacher(int id,int age,String name)
  {
	  this.id=id;
	  this.age=age;
	  this.name=name;
  }
  public int compareTo(Teacher ts)
  {
	  if( age==ts.age)
		  return 0;
	  else if(age>ts.age)
		  return 1;
	  else
		  return -1;
  
}}
public class DemoComparable {

	public static void main(String[] args) {
	   ArrayList l1=new ArrayList<>();
	   l1.add(new Teacher(1, 45,"Ashwini" ));
	   l1.add(new Teacher(2, 23, "Neha"));
	   Collections.sort(l1);
     Iterator lrt=l1.iterator();
     while(lrt.hasNext())
     {
    	 Teacher t1=(Teacher) lrt.next();
    	 System.out.println("Teacher Name: "+t1.name+" Age: "+t1.age);
     }
	}

}

package com.comparator.demo;
class Ashwini
{
	
  int id;
  String name;
  public Ashwini(int id,String name) {
	this.id=id;
	this.name=name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ashwini other = (Ashwini) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
  
}
public class DemoEqualHashcode {

	public static void main(String[] args) {
    /*Ashwini a1=new Ashwini(1,"Ashu");
    Ashwini t1=new Ashwini(1, "Ashu");      
      System.out.println(a1.equals(t1));
	  System.out.println(a1.hashCode());
	  System.out.println(t1.hashCode());
	  System.out.println(a1==t1);
	 */
	  String s1="Ashu";
	  String s2="Ashu";
	  String s3=new String("Arti");
	  String s4=new String("Ashu");
	  System.out.println(s1==s2);
	 System.out.println(s2==s4);
	 System.out.println(s2.equals(s4));
	 System.out.println(s2.hashCode());
	 System.out.println(s4.hashCode());
	 /* System.out.println(System.identityHashCode(s1));
	 System.out.println(System.identityHashCode(s2));
	 System.err.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	  
*/	
	
	}

}

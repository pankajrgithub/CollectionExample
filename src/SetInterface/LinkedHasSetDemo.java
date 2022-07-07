package SetInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

//LinkedHashSet support all set interface methods
//it maintains order(preserve order insertion order)
public class LinkedHasSetDemo {

	public static void main(String[] args) 
	{
		
      LinkedHashSet ls=new LinkedHashSet();  //one way to create LinkedHashSet obj
      
      LinkedHashSet<String> ls1=new LinkedHashSet<String>(); //another way homogeneous to store similar type of object
      
      ls.add("David");
      ls.add(12);
      ls.add('a');
      ls.add(true);
      ls.add(null);
      ls.add("David"); //Duplicate not allowed 
      ls.add(null); //utmost one null value allowed
      
     System.out.println(ls);
      
      //to print set element in arrange way-1 for loop
      
   /*   for(int i=0;i<ls.size();i++)
      {
    	  System.out.println(ls.get(i));
      } */
      
      
      //to print set element in arrange way-2 for each loop enhance loop
      System.out.println("Print Element using enhance for loop:");
      for(Object ob:ls)
      {
    	  System.out.println(ob);
      }
      
      //Using Iterator interface
     
      System.out.println("Print using Iterator Interface:");
      Iterator it=ls.iterator();
      
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      
	}

}

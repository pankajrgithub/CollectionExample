package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		
       List li=Arrays.asList("Erin","David","Michael","Tom","Kevin");
       
       ArrayList al=new ArrayList();
       
    /*   al.add("Erin");
       al.add("David");
       al.add("Michael");
       al.add("Tom");
       al.add("Kevin");
       
       //to replace or modify element using set(index,new object)
      // li.set(1, "Mary");
       //System.out.println("after replacing 'David' to' Mary' list item:"+li);
       
       //ArrayList Allows multiple null value entry
       
       al.add(null);
       al.add(null);
       */
       al.remove(0); //throws out of bound Exception
       al.remove("Erin"); //no exception it will print blank ArrayList
       System.out.println(al);
	}

}

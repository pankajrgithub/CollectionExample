package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList bags=new ArrayList();
		
		bags.add("Pen");
		bags.add("book");
		bags.add("Pencil");
		bags.add("lunch");
		bags.add("papaer");
		
		ArrayList box=new ArrayList();
		box.add("Pen");
		box.add("Pencil");
		box.add("rubber");
		
		
		System.out.println("bags item:"+bags);
		System.out.println("box item:"+box);
		
		//apply retainAll()  method to box passing bags as parameter
		
		System.out.println(box.retainAll(bags));
		
		//System.out.println("After aplying retainAll():");
		
		//System.out.println(box);
		//System.out.println(bags);
		
        System.out.println(bags.isEmpty());		//false
        
        bags.removeAll(bags); //removed all collection elements
        
        System.out.println("after removes:"+bags.isEmpty()); //true
        
       //ArrayList to Array Conversion
        Object[] ob= box.toArray(); 
        
        for(Object s:ob)
        {
        	System.out.println(s);//Pen,Pencil
        	
        }
        
        
        //clear() method to clear ArrayList
        
        box.clear();
        
        System.out.println("after clearing box:"+box);//[]
	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) 
	{
		/*ArrayList<String> num= new ArrayList<String>();
		
		num.add("x");
		num.add("y");
		num.add("z");
		num.add("a");
		num.add("b");
		num.add("c");
		num.add("d"); */
		
		List<String> item=Arrays.asList("x","y","z","a","b","c"); //another way to add item in ArrayList
		

	System.out.println("unsorted list:"+item);
	
/*	num.clear();
//	System.out.println("clear all the array list:"+num);
	
	num.add("g");
	
	System.out.println(num);
	
	
	num.remove(3); //num.remove(a);
	
	System.out.println("after removing elements:"+num);
	
//	num.removeAll(num);
	
//	System.out.println("after removing all elements:"+num);
	
	num.addAll(num);
	
	System.out.println("After adding all elements in arraylist"+num);
	
	
	if(num.contains("x")) //return boolean value
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	} */
	
	
	//to check length of ArrayList method call size()
	System.out.println("size of ArrayList is:"+item.size());
	
	
	Collections.sort(item);
	
	System.out.println("sorted list in ascending order:"+item);
	
	Collections.sort(item, Collections.reverseOrder());
	
	System.out.println("sorted list item in descending order"+item);
	
	
	}
	
	
	
	}

package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* 1.Homogeneous and Heterogeneous 
 * 2.no fixed length 
 * growable user can add any element at run time. 
 * Underlying data structure supported
 * predefine method to process data structure concept
 * Variable size not fixed size
 * used if more number of retrieve(search) operation in list 
 */
public class DemoArrayList {


	public static void main(String[] args) 
	{
	  
	ArrayList al=new ArrayList(); 
		
		al.add("Mohan");
		al.add("salary");
		al.add("5000");
		al.add("345.6f");
		
		
		//another way to add elements in list
		//List list=Arrays.asList("Mohan","Salary","50000","345.6f");
		
		// three ways to display ArrayList element 
		
	//	System.out.println(al); //[Mohan, salary, 5000, 345.6f]
		
		//using for loop to align out put properly
	
	/*	for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}  */
		
		//using foreach loop introduced in java 1.5//enhance loop statement
		
		al.add("Mohan");
		for(Object item:al)
		{
			System.out.println(item);
		}
		
		List al1=Arrays.asList(al);
		
		System.out.println("using method addAll():"+al1);
		
		//contain() ,containAll(collection c) to check wehther element available or not.
		System.out.println(al1.contains("mohit")); //false
		
		System.out.println(al1.containsAll(al)); //false
		
		System.out.println(al.contains("Mohan")); //true
		
		//using iterator 
		//Get the iterator
		
	/*	Iterator i=al.iterator();
			//Print the first item 	
			//System.out.println(i.next());
		//looping to print all list item
		while(i.hasNext())
		{
			System.out.println(i.next());
		} */
	} 

} 

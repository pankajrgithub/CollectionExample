package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

	public static void main(String[] args) 
	{
	
		String s[]= {"mohan","red","blue","voilet","Green"};
		
		
	/*	for(int it:i)
		{
			System.out.println(it);
		} 
		System.out.println("Using for loop to print array element");
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		} */
		
		System.out.println("Print elements after converting array to arraylist");
		
		ArrayList al=new ArrayList(Arrays.asList(s));
		System.out.println(al);

	}

}

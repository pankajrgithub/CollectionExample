package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*A map contains values on the basis of key, i.e. key and value pair (It's call entry)
 * A Map contains unique keys
 * A Map is useful if you have to search, update or delete elements on the basis of a key
 * Interface Map and SortedMap
 * Three Classes HashMap, LinkedHashMap, and TreeMap
 * can have duplicate values
 * HashMap and LinkedHashMap allow null keys and values
 * TreeMap doesn't allow any null key or value
  */
public class HashMapDemo {

	public static void main(String[] args) 
	{
		//HashMap is the implementation of Map, but it doesn't maintain any order.
		// it doesn't maintain any order.
		HashMap<Integer,String> hm=new HashMap();
		
		hm.put(1, "red");
		hm.put(3, "blue");
		hm.put(5, "Orange");
		hm.put(2, "black");
		hm.put(6, "green");
		//A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
		//duplicate key not allowed only duplicate value allowed
		
	
		hm.put(6, "red"); //in this case it will change existing key value hence duplicate key not recommended 
		System.out.println(hm);
		
		System.out.println("to get value of 1:"+hm.get(1));
		
		//to remove from pair from map
		
		hm.remove(1);
		System.out.println("after removing pairs entry from Map:"+hm);
		
		System.out.println(hm.containsKey(1)); //false
		System.out.println(hm.containsKey(2)); //true
		System.out.println(hm.containsValue("Orange"));
		
		System.out.println(hm.isEmpty()); //false
		
		//to get all keySet();
		
		System.out.println("to print all keySet:"+hm.keySet());
		
		//to get all values();
		System.out.println("to print all values:"+hm.values());
		
		
		System.out.println("to get keyset and values from map:");
	    System.out.println(hm.keySet()+"  "+hm.values());
		
	    
	    System.out.println("key and value pair:"+hm.entrySet());
	    
	    hm.remove(2, "black"); //remove key value
	    System.out.println(hm);
	    
	    //keySet() to get set of keys on Map
	    //Enhance loop
	    
	/*    System.out.println("Enhance for loop:keySet()");
	    for(Object si:hm.keySet())
	    {
	    	System.out.println(hm.get(si));
	    } */
	    
	    //Entry Method
	    
	    for(Map.Entry entry:hm.entrySet())
	    {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    
	    
	    //Iterator
	   System.out.println("Using Iterator:"); 
	    Set s=hm.entrySet();
	    
	    Iterator it=s.iterator();
	    while(it.hasNext())
	    {
	    	Map.Entry entry=(Entry) it.next();
	    	
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	}

}

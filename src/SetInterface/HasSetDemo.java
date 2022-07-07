package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* No indexing concept in set interface
 * duplicate not value allowed 
 * utmost one null value allowed
 * automatically create new set if .75 percent elements will full fill
 * HashSet doesn't maintain preserve insertion order
 */
public class HasSetDemo {

	public static void main(String[] args) 
	{
		
     Set colorSet=new HashSet();
   /*  
     colorSet.add("red");
     colorSet.add("Green");
     colorSet.add("Blue");
     colorSet.add("Pink");
     colorSet.add("black");
     colorSet.add("red"); //duplicate entry will not be add to set
     colorSet.add(null); 
     */
     colorSet.remove("red"); //[] no exception when set is empty
     
     
     System.out.println("color Set:"+colorSet);
     
     
	}
}
  /*   // hasCode() returns hash code of set
     
   //  System.out.println("hasCode:"+colorSet.hashCode());
     
     Set color=new TreeSet(); //convert hashSet to TreeSet
     color.addAll(colorSet);
     System.out.println("Tree Set:"+color);
    
  // Create an iterator for the color_Set
     Iterator it=colorSet.iterator();
     
     while(it.hasNext())
     {
    	 System.out.println(it.next());
    	 
     }
     
	}
	        //add()
			//addAll(collection o)
			//remove(object)
			//removeAll(Collection o)
			//contains() //return true and false
			//containsAll(Collection o) //return true and false
			//isEmpty() //return boolean type
			//retainsAll(collection o)//return boolean type
			//size() to return integer type
			//toArray() convert LinkedList to Array
			//clear() clean the LinkedList
		    //hashCode() 	Returns hashCode of the set.
      
}*/

package SetInterface;

import java.util.TreeSet;

/*TreeSet Objects are stored in a sorted and ascending order by default
 * Only Contains unique elements
 * access & retrieval is quick.
 * can't allow null value entery
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		
    TreeSet ts=new TreeSet(); //blank TreeSet 
    		
    ts.add("David");
    ts.add("Mary");
    ts.add("Kevin");
    ts.add("Mike");
 //   ts.add(null); //not allowed in TreeSet
    ts.add("Mary"); //duplicate not allowed
    
    System.out.println(ts);
    
    //pollLast() to remove/get last element from TreeSet
    System.out.println("to get last elements:"+ts.pollLast());
    
    //pollFirst() to remove/get first element from TreeSet
    System.out.println("to get first element:"+ts.pollFirst());
    
    ts.remove("Kevin");
    System.out.println(ts);
	}

}

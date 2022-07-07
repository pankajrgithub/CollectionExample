package LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


//Linked list also support heterogeneous and homogeneous elements
//Linked List used for when more number of insertion or deletion on Application
//Linked list store elements in node
//every node store elements including address of previous node and next node.
//It's become easier to add or delete elements from Linked List
//LinkedList derived from list(I) as well Deque(I).

public class LinkedListDemo1 {

	public static void main(String[] args) 
    {
		List ll=new LinkedList(); //using list interface
	/*	ll.add("David");
		ll.add(13);
		ll.add(23.45);
		ll.add(null); //null allowed
		ll.add("David"); //duplicate allowed
		*/
//		ll.remove(1);  //IndexoutOfBoundException when list is empty
		ll.remove("David"); //no exception when list is empty
		System.out.println(ll);
		
		//add()
		//addAll(collection o)
		//remove(object)
		//remove(index)
		//removeAll(Collection o)
		//contains() //return true and false
		//containsAll(Collection o) //return true and false
		//isEmpty() //return boolean type
		//retainsAll(collection o)//return boolean type
		//size() to return integer type
		//toArray() convert LinkedList to Array
		//clear() clean the LinkedList
		//set(index,new element) //to modify existing element
		
		System.out.println("size of linked list:"+ll.size());
		
		
		//using Deque interface
		
		Deque list=new LinkedList();
		
		list.add("HR");
		list.add("Admin");
		list.add("Support");
		list.add("financial");
		
		System.out.println("derived from deque interface:"+list);
		
		
	}

}

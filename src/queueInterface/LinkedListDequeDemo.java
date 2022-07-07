package queueInterface;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> dq=new LinkedList(); //Implementing Deque interface 

		// add elements
		
		dq.add("Dog");
		dq.add("cat");
		dq.add("Lion");
		dq.add("deer");
		
		System.out.println(dq);
			
		// add element at the beginning
		dq.addFirst("Elephant");
		
		//// add elements at the end
		dq.addLast("bear");
		
		System.out.println(dq);
		
		// remove the first element
		System.out.println(dq.removeFirst());
		
		// remove the last element
		System.out.println(dq.removeLast());
	}

}

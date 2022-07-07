package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

//implements List interface and queue and deque interface as well
// all list interface method used by Linkedlist
// since LinkedList call implements queue and deque interface so implement methods of these interfaces as well

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Queue<String> lan = new LinkedList<>(); //LinkedList implementing queue interface

	    // add elements
	    lan.add("Python");
	    lan.add("Java");
	    lan.add("C");
	    System.out.println(lan);
       
	    //offer():adds the specified element at the end of the linked list
	    //peek():returns the first element (head) of the linked list
	     lan.offer("PHP");
	     System.out.println(lan);
	     
	    String s=lan.peek(); //return head element from queue
	    System.out.println("head element:"+s);

	}

}

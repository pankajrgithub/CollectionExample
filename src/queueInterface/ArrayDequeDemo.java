package queueInterface;

import java.util.ArrayDeque;
import java.util.Deque;


/*ArrayDeque as a Stack
 * To implement a LIFO (Last-In-First-Out) stacks in Java
 * ArrayDeque implements Queue and Deque Interface 
 */
public class ArrayDequeDemo {

	public static void main(String[] args) 
	{
	//	Stack<String> ad=new Stack<String>(); //using stack
	//	ArrayDeque<String> ad1=new ArrayDeque<>();
		Deque<String> ad1=new ArrayDeque<>(); //ArrayDeque class is likely to be faster than the Stack class.

		//ArrayDeque provides the following methods that can be used for implementing a stack
		//push() adds an element to the top of the stack
		//pop() returns and removes an element from the top of the stack
		//peek() returns an element from the top of the stack
		
		ad1.push("Mohan");
		ad1.push("Kamal");
		ad1.push("Dinesh");
		ad1.push("Mayank");
		
		System.out.println(ad1);
		
		System.out.println(ad1.pop());
		
		System.out.println("after pop():"+ad1);
		
		System.out.println("peek():"+ad1.peek());
		
		System.out.println("after peek method:"+ad1);
		
	}

}

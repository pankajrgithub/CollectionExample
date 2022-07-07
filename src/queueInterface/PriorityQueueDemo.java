package queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

/*Priority queue elements are retrieved in sorted order 
 * preserve insertion order not maintained 
 * head of the priority queue is the smallest element of the queue.
 * 
 */

public class PriorityQueueDemo {

	public static void main(String[] args) 
	{
//		PriorityQueue pq=new PriorityQueue();  //one way to create priority queue
      PriorityQueue<Integer> pq=new PriorityQueue();
      
      // Using the add() method //If the queue is full, it throws an exception.
      pq.add(2);
      pq.add(4);
      pq.add(1);
      pq.add(3);
      pq.add(9);
      pq.add(10);
      pq.add(9); //duplicate allowed 
 //   pq.add(null); //null value not allowed in queue
      
      
     // offer() Insert specific elements in queueIf the queue is full, it returns false.
      
      pq.offer(12);
      
      //Enhance for loop
     System.out.println("Print queue elements"); 
      for(Integer i:pq)
      {
    	  System.out.println(i);
      }

      // Using the peek() method
      //This method returns the head of the queue
      
      System.out.println("head elements of the queue:"+pq.peek()); //[1]
      
      //remove() -remove elements from the queue
      System.out.println("using remove():"+pq.remove()); //remove head elements from queue
      //remove(object o) to specific elements
      pq.remove(12);
      System.out.println("after removing 12:"+pq);
      
      //poll() returns and removes the head of the queue
      int ip= pq.poll();
      System.out.println("using poll() to remove:"+ip);
      System.out.println("after poll"+pq);
      
      //Using the iterator() method and Iterator interface
     
      System.out.println("using iterator method:");
      Iterator it=pq.iterator();
      
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      //size() method returns number of elements present in queue
      
      System.out.println("total number of elements:"+pq.size());
      
    //  toArray() method converts queue to array
      
     
      
      Object ar[]= pq.toArray();
      System.out.println("after converting queue to array:");
      
      for(Object iq:ar)
      {
    	  System.out.println(iq);
      }
      
      
	}

}

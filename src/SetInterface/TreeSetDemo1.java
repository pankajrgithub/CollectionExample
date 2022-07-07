package SetInterface;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
	
			      TreeSet<Integer> treeSet = new TreeSet<Integer>();
			      treeSet.add(50);
			      treeSet.add(100);
			      treeSet.add(150);
			      treeSet.add(200);
			      treeSet.add(250);
			      treeSet.add(300);
			      treeSet.add(400);
			      treeSet.add(500);
			      treeSet.add(800);
			      treeSet.add(1000);
			      
			      //to get lowest and highest element from TreeSet 
			      //first()
			      //last()
			      System.out.println("TreeSet Lowest value = " + treeSet.first());
			      System.out.println("TreeSet Highest value = " + treeSet.last());
			
	}

}

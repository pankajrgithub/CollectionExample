package SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;
// sub set from 50 to 70, then use the subset(50,70) 
public class TreeSetDemo4 {

	public static void main(String[] args) {
	
			      TreeSet<Integer> treeSet = new TreeSet<Integer>();
			      treeSet.add(10);
			      treeSet.add(20);
			      treeSet.add(30);
			      treeSet.add(40);
			      treeSet.add(50);
			      treeSet.add(60);
			      treeSet.add(70);
			      treeSet.add(80);
			      treeSet.add(90);
			      treeSet.add(100);
			      SortedSet<Integer> sub = treeSet.subSet(50, 70);
			      System.out.println("Sub Set = " + sub);
			      sub = treeSet.subSet(80, 90);
			      System.out.println("Sub Set = " + sub);
			      sub = treeSet.subSet(10, 90);
			      System.out.println("Sub Set = " + sub);
			

	}

}

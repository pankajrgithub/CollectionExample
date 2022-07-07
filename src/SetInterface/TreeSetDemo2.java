package SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//To get HeadSet from TreeSet, 
		//at first create a TreeSet and add some elements:

		
		TreeSet<String> tree=new TreeSet<String>();
		
		tree.add("ABC");
		tree.add("XYZ");
		tree.add("KLM");
		tree.add("MNO");
		tree.add("WXY");
		tree.add("JKL");
		
		
		
	System.out.println(tree);
	System.out.println(tree.headSet("XYZ"));// [ABC, JKL, KLM, MNO, WXY]
	System.out.println(tree.headSet("MNO"));
//		SortedSet<String> set=tree.headSet("XYZ");
//		System.out.println("headSet():"+set);
	
	//Now, let us get Tail Set from the TreeSet
	
	 System.out.println(tree.tailSet("WXY"));
	}

}

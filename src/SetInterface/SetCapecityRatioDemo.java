package SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCapecityRatioDemo {

	public static void main(String[] args) 
	{
		
     Set<String> set=new LinkedHashSet<String>(20,0.75f); //It is used to initialize both the capacity and the fill ratio
                                                           //also call load capacity//once capacity will reach 75% a new bigger
                                                          //set will be created internally.
     
     set.add("Red");
     set.add("Blue");
     set.add("Green");
     set.add("Voilet");
     set.add("Megenta");
     set.add("Yellow");
     set.add("Pink");
     
     System.out.println(set);
     
     
	}

}
